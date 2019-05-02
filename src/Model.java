
import java.sql.*;
public abstract class Model {
	private String local = "localhost";
    private String user = "usuario";
    private String password = "secret";
    private String port = "5432";
    private String database = "banco-projeto";
    private Connection c;
    private Statement statement;
    private String str_conexao;
    private String driverjdbc;
 
    public Model() {
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
    } 
    
    public void finalize() {
    	try {
            this.c.close();
        }catch (SQLException ex) {
            System.err.println(ex);
            ex.printStackTrace();
        }
    }

    /*public void create(String data[]) {
    	String query = "insert into tabela (";
    	for (String string : data) {
			data.
		}
    }*/
}
