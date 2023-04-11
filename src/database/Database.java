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
}
