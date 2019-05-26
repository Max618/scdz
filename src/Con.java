import java.sql.*;
public class Con {
	private static String local = "localhost";
    private static String user = "admin";
    private static String password = "";
    private static String port = "5432";
    private static String database = "banco-projeto";
    private static Connection c;
    private static Statement statement;
    private static String str_conexao;
    private static String driverjdbc;
    
    public static void initialize() {
    	Con.str_conexao = "jdbc:postgresql://"+ Con.local +":" + Con.port +"/"+ Con.database;
        Con.driverjdbc = "org.postgresql.Driver";
        try {
          Class.forName(Con.driverjdbc);
          Con.c = (Connection) DriverManager.getConnection(Con.str_conexao, Con.user, Con.password);
          Con.statement = (Statement) ((java.sql.Connection) Con.c).createStatement();
        }
        catch(SQLException ex){
	      System.out.println("SQLException: " + ex.getMessage());
	      System.out.println("SQLState: " + ex.getSQLState());
	      System.out.println("VendorError: " + ex.getErrorCode());
	    }
		catch(Exception e){
		  System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
		}
    }
    
    public static void end() {
    	try {
          Con.c.close();
        }catch (SQLException ex) {
          System.err.println(ex);
          ex.printStackTrace();
        }
    }
    
    public static ResultSet executeSelectQuery(String query) {
    	initialize();
    	try {
    		ResultSet r = statement.executeQuery(query);
    		end();
			return r;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	end();
		return null;
    }
    
	public static void executeInsertQuery(String query) {
    	try {
    		initialize();
			statement.execute(query);
			end();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void executeUpdateQuery(String query) {
		try {
    		initialize();
			statement.execute(query);
			end();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void executeDeleteQuery(String query) {
		try {
    		initialize();
			statement.execute(query);
			end();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
