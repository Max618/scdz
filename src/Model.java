import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public abstract class Model {
	private String local = "localhost";
    private String user = "admin";
    private String password = "";
    private String port = "5432";
    private String database = "banco-projeto";
    private Connection c;
    private Statement statement;
    private String str_conexao;
    private String driverjdbc;
    public Map<String, String> fillable;
 
    public Model(String[] attributes,String[] data) {
        this.str_conexao = "jdbc:postgresql://"+ this.local +":" + this.port +"/"+ this.database;
        this.driverjdbc = "org.postgresql.Driver";
        try {
          Class.forName(this.driverjdbc);
          this.c = DriverManager.getConnection(this.str_conexao, this.user, this.password);
          this.statement = (Statement) this.c.createStatement();
        }
        catch(SQLException ex){
	      System.out.println("SQLException: " + ex.getMessage());
	      System.out.println("SQLState: " + ex.getSQLState());
	      System.out.println("VendorError: " + ex.getErrorCode());
	    }
		catch(Exception e){
		  System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
		}
        this.fillable = new HashMap<String, String>();
        this.mapArray(attributes, data);
    }
    
    public void finalize() {
    	try {
          this.c.close();
        }catch (SQLException ex) {
          System.err.println(ex);
          ex.printStackTrace();
        }
    }
    
    private String getClassName() {
        return this.getClass().getName().toLowerCase().concat("s");
    }
    
    private void mapArray(String[] attributes, String data[]) {
    	for(int i = 0; i < attributes.length; i++) {
    		this.fillable.put(attributes[i],data[i]);
    	}	
    }
    
    public void create(String data[]) {
    	List<String> list = new ArrayList<String>(this.fillable.keySet());
    	String query = "insert into "+ this.getClassName() +" (";
    	for(int i = 0; i < list.size(); i++) {
    		query += list.get(i) + ",";
    	}
    	query = query.substring(0, query.length() - 1);
    	query += ") values (";
    	for(int i = 0; i < list.size(); i++) {
    		query += "'" + this.fillable.get(list.get(i)) +"',";
    	}
    	query = query.substring(0, query.length() - 1);
    	query += ");";
    	try {
			statement.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
