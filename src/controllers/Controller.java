package controllers;
import database.Database;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import utils.Utils;
import views.View;

public class Controller {
    
    public static void listaTabela() throws SQLException{
        Database db = new Database();
        String[][] result = db.selectAll( "produto", "*");
        View.displayTable(result);
    }
    
    public static void insereDadosTabela() throws SQLException {
        Database db = new Database();
        String[] columnsNames = db.getColumnsNamesList("produto");
        
        String parametros = "";
        int x = 0;
        while(true){
            System.out.printf("Digite o valor da coluna: %s\n", columnsNames[x]);
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("");
                String parametro = sc.nextLine();
                
                if(!Utils.isNumeric(parametro)){
                    parametro = "'" + parametro + "'";
                }
                
                if(x == 0){
                    parametros = parametros + parametro;
                }
                else{
                    parametros = parametros + "," + parametro;
                }
                x++;
                if (x == 5){break;}                
            }
            catch(Exception e){
                System.out.println("Informação inválida!");
            }
        }
        db.insertInto("produto", parametros);
        System.out.println("Adicionado com sucesso");
    }
    
    public static void apagaDadosTabela() throws SQLException{
        Database db = new Database();
        
        while(true){
            listaTabela();
            
            System.out.println("Digite o id de um produto para apagar");
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Id: ");
                int id_produto = sc.nextInt();
                
                db.deleteRow("produto", id_produto);
                break;
            }
            catch(Exception e){
                System.out.println("Id inválido");
            }
        }
        System.out.println("Produto apagado!");
    }
}
