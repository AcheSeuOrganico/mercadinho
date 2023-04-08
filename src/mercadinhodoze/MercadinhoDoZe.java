package mercadinhodoze;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import database.Database;
import java.sql.ResultSet;

import views.AbstractView;

public class MercadinhoDoZe {

    public static void main(String[] args) {
       String url = "jdbc:mysql://localhost:3306/teste";
       String username = "root";
       String password = "";

       try (Connection connection = DriverManager.getConnection(url, username, password)) {
        
        Database db = new Database(connection);
        ResultSet rs = db.selectAll("teste");
        AbstractView.displayTable(rs);
       
       } catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
       
       }
    }    
}
