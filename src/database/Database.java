package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

public class Database {
    public String url = "jdbc:mysql://localhost:3306/mercadinho";
    public String username = "root";
    public String password = "";
    
    
    public boolean exists(String table, String column, String value){
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            String query = String.format("SELECT * FROM %s WHERE %s = '%s'", table, column, value);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            return rs.next();
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
    public void updateValue(String table, String[] values, String id){
         try (Connection connection = DriverManager.getConnection(url, username, password)){
            String set = "SET ";
            String[] columns = this.getColumnsNamesList(table);
            
            for(int i = 0; i < values.length; i++){
                if(i == 0 ){
                    String keyValuePair = String.format("%s = %s", columns[i + 1], values[i]);
                    set = set + keyValuePair;
                }
                else{
                    String keyValuePair = String.format(",%s = %s", columns[i + 1], values[i]);
                    set = set + keyValuePair;
                }                
            }
                       
            String query = String.format("UPDATE %s %s WHERE id_produto = %s;", table, set, id);
            Statement statement = connection.createStatement();
            statement.execute(query);
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
  
    public String[] getColumnsNamesList(String table){
    try (Connection connection = DriverManager.getConnection(url, username, password)){
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(String.format("SHOW COLUMNS FROM %s", table));
        ArrayList<String> parametros = new ArrayList<>();

        int x = 0;
        while(rs.next()){
            parametros.add(x, rs.getString(1));
            x++;
        }
        
        String[] parametrosList = new String[parametros.size()];
        return parametros.toArray(parametrosList);
    }
    catch (SQLException e) {
        throw new IllegalStateException("SQL Error", e);
    }
}

    public int countAll(String table){
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(String.format("SELECT COUNT(*) FROM %s;", table));
            
            int total = 0;
            while(rs.next()){
                total = rs.getInt(1);
            }
            return total;
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
        
    public String[][] selectAll(String table, String columns) {
        try (Connection connection = DriverManager.getConnection(url, username, password)){
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(String.format("SELECT %s FROM %s;",columns, table));
                ResultSetMetaData rsmd = rs.getMetaData();
                
                int numeroColunas = rsmd.getColumnCount();
                int numeroLinhas = this.countAll(table);
                String[][] results = new String[numeroLinhas][numeroColunas];

                while(rs.next()){
                    for(int i=1; i<=numeroColunas; i++){
                        results[rs.getRow() - 1][i-1] = rs.getString(i);
                    }
                }
            return results;
        } 
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
    public void insertInto(String table, String produtoValues){
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            Statement statement = connection.createStatement();
            
            String[] columnsNamesList = this.getColumnsNamesList(table);            
            columnsNamesList[0] = "";
            String columnsNames = String.join(",", columnsNamesList);
            char[] columnsNamesChar = columnsNames.toCharArray();
            columnsNamesChar[0] = ' ';
            columnsNames = String.valueOf(columnsNamesChar);
            
            String query = String.format("INSERT INTO %s (%s) VALUES %s;", table, columnsNames, produtoValues);
            statement.execute(query);
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
    public void deleteRow(String table, int row){
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            Statement statement = connection.createStatement();
            String query = String.format("DELETE FROM %s WHERE id_produto = %d;", table, row);
            statement.execute(query);
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    public String[] getOne(String table, String[] columns, int id){
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            String columnsNames = String.join(",", columns);
            String query = String.format("SELECT %s FROM %s WHERE id_produto=%s", columnsNames, table, id);
            Statement statement = connection.createStatement(); 
            ResultSet rs = statement.executeQuery(query);
            String[] produto = new String[columns.length];
            
            while(rs.next()){
                for(int i = 1; i <= columns.length;i++){
                    produto[i - 1] = rs.getString(i);
                }
            }
            
            return produto;
        } catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
    public String[][] selectJoin(String table1, String table2, String[] columns, String where) {
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            String whereStatement = "";
            if(!where.equalsIgnoreCase("")){
                for(int i = 0; i < columns.length; i++){
                    if(i == 0){
                        whereStatement = whereStatement + String.format("WHERE %s LIKE ", columns[i]) + "'%" + where + "%'";
                    }
                    else{
                        whereStatement = whereStatement + " OR " + String.format("%s LIKE ", columns[i]) + "'%" + where + "%'";
                    }
                }
            }               
            
            Statement statement = connection.createStatement();
            String query = String.format("SELECT %s FROM %s x JOIN %s y ON x.id_produto = y.id_produto %s;",String.join(",", columns), table1, table2, whereStatement);
            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();

            int numeroColunas = rsmd.getColumnCount();
            int numeroLinhas = this.countAll(table1);
            String[][] results = new String[numeroLinhas][numeroColunas + 1];

            while(rs.next()){
                for(int i=1; i<=numeroColunas; i++){
                    results[rs.getRow() - 1][i-1] = rs.getString(i);
                }
            }
            return results;
        } 
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }
    }
    
    public int getIdProduto(String nomeProduto){
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            Statement statement = connection.createStatement();
            String query = String.format("SELECT id_produto FROM produto WHERE nome = '%s'", nomeProduto);
            ResultSet rs = statement.executeQuery(query);
            
            int idProduto = 0;
            while(rs.next()){
                idProduto = Integer.parseInt(rs.getString(1));
            }

            return idProduto;
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }        
    }
    
    public void updateRows(String table, String targetColumn, String[] productsIds, String[] productsValues){
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            String updateStatement = String.format("UPDATE %s", table);
            String setStatement = String.format("SET %s", targetColumn);
            String whereStatement = String.format("WHERE id_produto IN (%s)", String.join(", ", productsIds));
            
            String whenStatements = "";
            for(int i = 0; i < productsValues.length; i++){
                String when = String.format("WHEN id_produto = %s THEN %s ", productsIds[i], productsValues[i]);
                whenStatements = whenStatements + when;
            }
            
            Statement statement = connection.createStatement();
            String query = String.format("%s %s = CASE %s ELSE %s END %s;", updateStatement, setStatement, whenStatements, targetColumn, whereStatement);
            statement.execute(query);
        }
        catch (SQLException e) {
            throw new IllegalStateException("SQL Error", e);
        }   
    }
}
