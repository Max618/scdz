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
    protected abstract void setId(int id);
 
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
    
    private String getTableName() {
        return this.getClass().getName().toLowerCase().concat("s");
    }
    
    private void mapArray(String[] attributes, String data[]) {
    	for(int i = 0; i < attributes.length; i++) {
    		this.fillable.put(attributes[i],data[i]);
    	}
    }
    
    private String removeLastChar(String s) {
    	return s.substring(0, s.length() - 1);
    }
    private String makeQuery(String type) {
    	String query = "";
    	if(type.equals("insert")){
    		List<String> list = this.getAttributes();
    		query = "insert into " + this.getTableName() + " (";
    		for(int i = 0; i < list.size(); i++) {
        		query += list.get(i) + ",";
        	}
    		query += "created_at";
        	//query = removeLastChar(query);
        	query += ") values (";
        	for(int i = 0; i < list.size(); i++) {
        		query += "'" + this.fillable.get(list.get(i)) +"',";
        	}
        	query += "current_timestamp";
        	//query = removeLastChar(query);
        	query += ")";
    	}
    	if(type.equals("update")) {
    		query = "update " + this.getTableName() + " set ";
    	}
    	else if(type.equals("delete")) {
    		query = "delete from " + this.getTableName() + " ";
    	}
    	else if(type.equals("select")) {
    		query = "select * from " + this.getTableName() + " ";
    	}
    	return query + ";";
    }
    
    private String makeQuery(String type, String options) {
    	String query = "";
    	if(type.equals("update")) {
    		query = "update " + this.getTableName() + " set ";
    	}
    	else if(type.equals("delete")) {
    		query = "delete from " + this.getTableName() + " ";
    	}
    	else if(type.equals("select")) {
    		query = "select * from " + this.getTableName() + " " + options;
    	}
    	return query + ";";
    }
    
    public ArrayList<String> getAttributes(){
    	return new ArrayList<String>(this.fillable.keySet());
    }
    
    public void create() {
    	
    	String query = this.makeQuery("insert");
    	System.out.println(query);
    	try {
			statement.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String op = "order by created_at desc limit 1";
    	String querySelect = this.makeQuery("select", op);
    	
    	try {
			statement.execute(querySelect);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			ResultSet rs = statement.executeQuery(querySelect);
			while (rs.next())
			{
				this.setId(rs.getInt("id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
