package views;


public class View {
    
    public static void displayTable(String[][] table) {
        for(String[] i : table){
            for(String j : i){
                System.out.printf("|%-23s",j);
            }
            System.out.println("|");
        }
    }
}
