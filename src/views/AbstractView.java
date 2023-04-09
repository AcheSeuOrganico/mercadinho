package views;
import java.sql.SQLException;

public class AbstractView {
    
    public static void displayTable(String[][] table) {
        for(String[] i : table){
            for(String j : i){
                System.out.printf("%-28s",j);
            }
            System.out.println("");
        }
    }
}
