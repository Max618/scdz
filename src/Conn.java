import java.sql.*;
public class Conn {
	private static String local = "localhost";
    private static String user = "postgres";
    private static String password = "postgres";
    private static String port = "5432";
    private static String database = "banco-projeto";
    private static Connection c;
    private static Statement statement;
    private static String str_conexao;
    private static String driverjdbc;
    
    public static void initialize() {
    	Conn.str_conexao = "jdbc:postgresql://"+ Conn.local +":" + Conn.port +"/"+ Conn.database;
        Conn.driverjdbc = "org.postgresql.Driver";
        try {
          Class.forName(Conn.driverjdbc);
          Conn.c = (Connection) DriverManager.getConnection(Conn.str_conexao, Conn.user, Conn.password);
          Conn.statement = (Statement) ((java.sql.Connection) Conn.c).createStatement();
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
          Conn.c.close();
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