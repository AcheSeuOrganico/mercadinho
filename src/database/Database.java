package database;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Database {
    Connection connection;
    
    public Database(Connection connection){
        this.connection = connection;
    }
    
    public String getColumnsNames(String table){
        try (Statement statement = this.connection.createStatement()){
            ResultSet rs = statement.executeQuery(String.format("SELECT * FROM %s;", table));
            ResultSetMetaData rsmd = rs.getMetaData();
            
            String parametros = "";
            
            int x = 1;
            while(rs.next()){
                if (x == 1){
                    parametros = parametros + rsmd.getColumnName(x);
                }
                else{
                    parametros = parametros + "," + rsmd.getColumnName(x);
                }
                x++;
            }
            return parametros;
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
    public String[] getColumnsNamesList(String table){
        try (Statement statement = this.connection.createStatement()){
            ResultSet rs = statement.executeQuery(String.format("SELECT * FROM %s;", table));
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numeroColunas = rsmd.getColumnCount();
            String[] parametros = new String[numeroColunas - 1];
            
            while(rs.next()){
                
                for(int i = 0; i < numeroColunas - 1; i++){
                    parametros[i] = rsmd.getColumnName(i + 2);
                }
                break;
            }
            return parametros;
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
    public int countAll(String table){
        try (Statement statement = this.connection.createStatement()){
            ResultSet rs = statement.executeQuery(String.format("SELECT COUNT(*) FROM %s;", table));
            
            int total = 0;
            while(rs.next()){
                total = rs.getInt(1);
            }
            return total;
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
        
    public String[][] selectAll(String table, String columns) {
        try (Statement statement = this.connection.createStatement()) {
                ResultSet rs = statement.executeQuery(String.format("SELECT %s FROM %s;",columns, table));
                ResultSetMetaData rsmd = rs.getMetaData();
                
                int numeroColunas = rsmd.getColumnCount();
                int numeroLinhas = this.countAll(table);
                String[][] results = new String[numeroLinhas + 1][numeroColunas];

                while(rs.next()){
                    for(int i = 0; i < numeroColunas; i++){
                       results[0][i] = rsmd.getColumnName(i + 1);
                    }
                  
                    for(int i=1; i<=numeroColunas; i++){
                        results[rs.getRow()][i-1] = rs.getString(i);
                    }
                }
            return results;
        } 
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
    public void insertInto(String table, String produtoValues){
        try (Statement statement = this.connection.createStatement()) {
            int indice = this.countAll(table) + 1;
            String id_produto = String.valueOf(indice);

            String values = id_produto + ", " + produtoValues;
            String query = String.format("INSERT INTO %s VALUES (%s);", table, values);
            
            statement.execute(query);
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
    public void deleteRow(String table, int row){
        try (Statement statement = this.connection.createStatement()) {
            String query = String.format("DELETE FROM %s WHERE id_produto = %d;", table, row);
            statement.execute(query);
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
}
