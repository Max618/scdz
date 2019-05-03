
public class Employee extends Model {
	private int id;
	private String name;
	private String email;
	private String password;
	private String address;
	private String cpf;
	private double salary;
	
	public Employee(String name, String email, String password, String address, String cpf, double salary) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.cpf = cpf;
		this.salary = salary;
	}
	public String getName() {
		return this.name;
	}
	
}
