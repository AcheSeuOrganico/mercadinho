package mercadinhodoze;
import java.sql.SQLException;

import controllers.Controller;
import utils.Menu;
import database.Database;

public class MercadinhoDoZe {

    public static void main(String[] args) throws SQLException{

            Database db = new Database();
            
            String[] teste = db.getColumnsNamesList("produto");
            
            for(String oi : teste){
                System.out.println(oi);
            }
            
//            while(true){
//                Menu.menuPrincipal();
//                int opcao = Menu.pegaOpcao();
//                
//                switch(opcao){
//                    
//                    case 1 -> Controller.listaTabela();
//                    case 2 -> Controller.insereDadosTabela();
//                    case 3 -> Controller.apagaDadosTabela();
//                    case 5 -> System.exit(0);
//                    default -> System.out.println("Opção inválida! Seleciona uma das opções listadas");
//                    
//                }
//            }        
        }

    }    

