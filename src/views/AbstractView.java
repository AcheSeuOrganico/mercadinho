package views;


public class AbstractView {
    
    public static void displayTable(String[][] table) {
        for(String[] i : table){
            for(String j : i){
//                if(null != j){
//                    System.out.printf("|%-28s",j);
//                }
//                else{
//                    System.out.printf("|%-28s", "N/A");
//                }
                System.out.printf("|%-28s",j);
            }
            System.out.println("|");
        }
    }
}
