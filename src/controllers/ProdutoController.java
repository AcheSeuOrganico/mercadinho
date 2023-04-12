package controllers;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.SQLException;

import database.Database;
import views.AbstractView;
import utils.Utils;

public class ProdutoController extends AbstractController{

    public static void listaProdutos(Connection connection) throws SQLException{
        Database db = new Database(connection);
        String[][] result = db.selectAll( "produto", "*");
        AbstractView.displayTable(result);
    }
    
    public static void insertProduto(Connection connection) throws SQLException {
        Database db = new Database(connection);
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
    }
    
}
