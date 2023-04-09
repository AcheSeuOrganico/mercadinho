package database;
import java.util.Map;
import java.util.HashMap;
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
        
    public String[][] selectAll(String table) {
        try (Statement statement = this.connection.createStatement()) {
                ResultSet rs = statement.executeQuery(String.format("SELECT * FROM %s;", table));
                ResultSetMetaData rsmd = rs.getMetaData();
                
                int numeroColunas = rsmd.getColumnCount();
                String[][] results = new String[2][numeroColunas];
                
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
