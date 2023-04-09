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
        }catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
        
    public String[][] selectAll(String table) {
        try (Statement statement = this.connection.createStatement()) {
                ResultSet rs = statement.executeQuery(String.format("SELECT * FROM %s;", table));
                ResultSetMetaData rsmd = rs.getMetaData();
                
                int numeroColunas = rsmd.getColumnCount();
                int numeroLinhas = this.countAll(table);
                String[][] results = new String[numeroLinhas][numeroColunas];

                while(rs.next()){
                    for (String[] result : results) {
                        for (int j = 1; j <= numeroColunas; j++) {
                            result[j - 1] = rs.getString(j);
                        }
                    }
                }
            return results;
        } catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
}
