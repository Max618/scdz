import java.util.HashMap;
import java.util.Map;

public class Employee extends Model {
	protected int id;

	public Employee(String[] data) {
		super();
		String[] attributes = {"name", "email", "password","address","cpf","salary"};
		this.fillable = new HashMap<String, String>();
        this.mapArray(attributes, data);
	}
	public Employee() {
		super();
		String[] attributes = {"name", "email", "password","address","cpf","salary"};
		this.fillable = new HashMap<String, String>();
        this.mapArray(attributes);
	}
	
	static
    {
        setMyClass(Employee.class);
    }
	
	@Override
	protected void setId(int id) {
		this.id = id;
	}
	
	public void imprimir() {
		System.out.println(id);
	}
	
	public void setName(String newName) {
		this.fillable.put("name",newName);
	}
	public String getName() {
		return this.fillable.get("name");
	}
}
