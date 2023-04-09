package controllers;
import java.sql.Connection;
import java.sql.SQLException;

import database.Database;
import views.AbstractView;

public class ProdutoController extends AbstractController{

    public static void listaProdutos(Connection connection) throws SQLException{
        Database db = new Database(connection);
        String[][] result = db.selectAll("produto");
        AbstractView.displayTable(result);
    }
    
}
