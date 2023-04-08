package mercadinhodoze;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MercadinhoDoZe {

    public static void main(String[] args) {
       String url = "jdbc:mysql://localhost:3306/teste";
       String username = "root";
       String password = "";

       try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database conectado");
       } catch (SQLException e) {
            throw new IllegalStateException("Conexão interrompida", e);
       }
    }
    
}
