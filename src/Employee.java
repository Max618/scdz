
public class Employee extends Model {
	protected int id;

	public Employee(String[] attributes, String[] data) {
		super(attributes, data);
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
