package database;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class Database {
    Connection connection;
    
    public Database(Connection connection){
        this.connection = connection;
    }
    
    public ResultSet selectAll(String table){
        try(Statement statement = this.connection.createStatement()){
            ResultSet rs = statement.executeQuery(String.format("SELECT * FROM %s;", table));
            return rs;
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
       
       }
    }
}
