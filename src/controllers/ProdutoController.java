package controllers;
import java.sql.Connection;
import java.sql.SQLException;

import database.Database;
import views.AbstractView;

public class ProdutoController extends AbstractController{

    public static void listaProdutos(Connection connection) throws SQLException{
        Database db = new Database(connection);
        String[][] result = db.selectAll( "produto", "*");
        AbstractView.displayTable(result);
    }
    
    public static void insertProduto(Connection connection) throws SQLException {
        Database db = new Database(connection);
        db.insertInto("produto", "'Carro', 'automoveis', 18000.00, 30000.00, '2018-12-12 12:12:12'");
    }
    
}
