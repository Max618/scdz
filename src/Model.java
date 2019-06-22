import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
public abstract class Model {
    protected Map<String, String> fillable;
    protected abstract void setId(int id);
    private static Class<? extends Model> myClass;
    private Map<String, Integer> att;
 
    public Model() {
    	super();
        this.att = new HashMap<String, Integer>();
    }
    
    protected static void setMyClass(Class<? extends Model> clazz)
    {
        myClass = clazz;
    }
     
    private static Class<? extends Model> getMyClass() 
    {
        return myClass;
    }
    
    private static String getTableName() {
        return Model.getCallerClass().toString().split(" ",2)[1].toLowerCase().concat("s");
    }
    
    private static Object getCallerClass() {
    	//return new Throwable().getStackTrace()[1].getClassName();
    	return getMyClass();
    }
    
    private String removeLastChar(String s) {
    	return s.substring(0, s.length() - 1);
    }
    
    protected void mapArray(String[] attributes, String data[]) {
    	for(int i = 0; i < attributes.length; i++) {
    		this.fillable.put(attributes[i],data[i]);
    		this.att.put(attributes[i], i);
    	}
    }
    
    protected void mapArray(String[] attributes) {
    	for(int i = 0; i < attributes.length; i++) {
    		this.fillable.put(attributes[i], ""+i);
    		this.att.put(attributes[i], i);
    	}
    }
    
    private String makeQuery(String type, String[] data) {
    	String query = "";
    	List<String> list = this.getAttributes();
    	this.fill(data);
    	if(type.equals("insert")){
    		query = "insert into " + Model.getTableName() + " (";
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
    		query = "update " + Model.getTableName() + " set";
    		for(int i = 0; i < list.size(); i++) {
        		query += " " + list.get(i) + " = '" + this.fillable.get(list.get(i)) + "',";
        	}
    		query = removeLastChar(query);
    	}
    	else if(type.equals("delete")) {
    		query = "delete from " + Model.getTableName() + " ";
    	}
    	else if(type.equals("select")) {
    		query = "select * from " + Model.getTableName() + " ";
    	}
    	return query + ";";
    }
    
    private String makeQuery(String type, String options) {
    	String query = "";
    	if(type.equals("update")) {
    		query = "update " + Model.getTableName() + " set ";
    	}
    	else if(type.equals("delete")) {
    		query = "delete from " + Model.getTableName() + " " + options;
    	}
    	else if(type.equals("select")) {
    		query = "select * from " + Model.getTableName() + " " + options;
    	}
    	return query + ";";
    }
    
    public Object fill(String[] data) {
    	String[] attributes = this.fillable.keySet().toArray(new String[this.fillable.size()]);
    	try {
    		for(int i = 0; i < this.fillable.size(); i++) {
        		String index = this.fillable.get(attributes[i]);
        		this.fillable.put(attributes[i],data[Integer.parseInt(index)]);
        	}
    	} catch (NumberFormatException e) {
    		for(int i = 0; i < this.fillable.size(); i++) {
        		int index = this.att.get(attributes[i]);
        		this.fillable.put(attributes[i],data[index]);
        	}
    	}
    	return this;
    }
    
    private ArrayList<String> getAttributes(){
    	return new ArrayList<String>(this.fillable.keySet());
    }
    
    public Object create(String[] data) {
    	
    	String query = this.makeQuery("insert", data);
    	System.out.println(query);
    	Con.executeInsertQuery(query);
    	String op = "order by created_at desc limit 1";
    	String querySelect = this.makeQuery("select", op);
    	
    	try {
			ResultSet rs = Con.executeSelectQuery(querySelect);
			while (rs.next())
			{
				this.setId(rs.getInt("id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Model.getCallerClass();
    	
    }
    
    public Object find(int id) {
    	String op = "where id = " + id;
    	String query = this.makeQuery("select", op);
    	List<String> list = this.getAttributes();
    	try {
			ResultSet rs = Con.executeSelectQuery(query);
			while (rs.next())
			{
				for(int i = 0; i < list.size(); i++) {
					this.fillable.put(list.get(i), rs.getString(list.get(i)));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Model.getCallerClass();
    }
    
    public Object all() {
    	// IMPLEMENTANDO AINDA
    	String query = this.makeQuery("select", "");
    	//List<String> list = new ArrayList<String>();
    	ResultSet rs = Con.executeSelectQuery(query);
		try {
			ResultSetMetaData rsmd = rs.getMetaData(); 
			int columnCount = rsmd.getColumnCount();
			ArrayList<String> list = new ArrayList<String>(columnCount);
			ArrayList<ArrayList> resultList = new ArrayList<ArrayList>(); 
			while (rs.next()) {              
			   int i = 1;
			   while(i <= columnCount) {
			        list.add(rs.getString(i++));
			   }
			   resultList.add(list);
			   list = new ArrayList<String>(columnCount);
			}
			return resultList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
    }
    
    public Object update(String[] data, int id) {
    	String query = this.makeQuery("update", data);
    	query = removeLastChar(query);
    	query += " where id = " + id + ";";
    	Con.executeUpdateQuery(query);
    	return Model.getCallerClass();
    }
    public Object delete(int id) {
    	String options = "where id = " + id;
    	String query = this.makeQuery("delete", options);
    	Con.executeDeleteQuery(query);
    	return Model.getCallerClass();
    }
    
    public void imprimir() {
    	List<String> list = this.getAttributes();
    	String value;
    	String key;
    	for(int i = 0; i < this.fillable.size(); i++) {
    		key = list.get(i);
    		value = this.fillable.get(key);
    		System.out.println(key + ": " + value);
    	}
    }
}
