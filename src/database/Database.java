package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Database {
    String url = "jdbc:mysql://localhost:3306/mercadinho";
    String username = "root";
    String password = "";
    
    
    public void rawQuery(String query){
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            Statement statement = connection.createStatement();
            statement.executeQuery(query);
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
    public String getColumnsNames(String table){
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(String.format("SHOW COLUMNS FROM %s", table));
            ResultSetMetaData rsmd = rs.getMetaData();
            
            String parametros = "";
            
            int x = 1;
            while(rs.next()){
                
            }
            return parametros;
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
    public String[] getColumnsNamesList(String table){
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(String.format("SHOW COLUMNS FROM %s", table));
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            int numeroColunas = rsmd.getColumnCount();
            String[] parametros = new String[numeroColunas];
            
            int x = 0;
            while(rs.next()){
                parametros[x] = rs.getString(1);
                x++;
            }
            return parametros;
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }

    public int countAll(String table){
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            Statement statement = connection.createStatement();
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
        try (Connection connection = DriverManager.getConnection(url, username, password)){
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(String.format("SELECT %s FROM %s;",columns, table));
                ResultSetMetaData rsmd = rs.getMetaData();
                
                int numeroColunas = rsmd.getColumnCount();
                int numeroLinhas = this.countAll(table);
                String[][] results = new String[numeroLinhas][numeroColunas];

                while(rs.next()){
                    for(int i=1; i<=numeroColunas; i++){
                        results[rs.getRow() - 1][i-1] = rs.getString(i);
                    }
                }
            return results;
        } 
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
    public void insertInto(String table, String produtoValues){
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            Statement statement = connection.createStatement();
            int indice = this.countAll(table) + 1;
            String id_produto = String.valueOf(indice);

            String values = id_produto + ", " + produtoValues;
            System.out.println(values);
            String query = String.format("INSERT INTO %s VALUES (%s);", table, values);
            
            statement.execute(query);
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
    public void deleteRow(String table, int row){
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            Statement statement = connection.createStatement();
            String query = String.format("DELETE FROM %s WHERE id_produto = %d;", table, row);
            statement.execute(query);
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    public static void Metodo (){
        System.out.println("metodo");
    }
}
