package mercadinhodoze;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import controllers.ProdutoController;


public class MercadinhoDoZe {

    public static void main(String[] args) {
       String url = "jdbc:mysql://localhost:3306/teste";
       String username = "root";
       String password = "";

       try (Connection connection = DriverManager.getConnection(url, username, password)) {
        
        ProdutoController.listaProdutos(connection);
        
       } catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
       }
    }    
}
