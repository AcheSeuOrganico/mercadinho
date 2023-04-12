package mercadinhodoze;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import controllers.Controller;
import utils.Menu;

public class MercadinhoDoZe {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mercadinho";
        String username = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            
            while(true){
                Menu.menuPrincipal();
                int opcao = Menu.pegaOpcao();
                
                switch(opcao){
                    
                    case 1 -> Controller.listaTabela(connection);
                    case 2 -> Controller.insereDadosTabela(connection);
                    case 3 -> Controller.apagaDadosTabela(connection);
                    default -> System.out.println("Opção inválida! Seleciona uma das opções listadas");
                    
                }
            }        
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }    
}
