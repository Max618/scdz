import java.util.HashMap;

public class Provider extends Model{
	protected int id;

	public Provider(String[] data) {
		super();
		String[] attributes = {"name", "cnpj", "email","phone", "address"};
		this.fillable = new HashMap<String, String>();
        this.mapArray(attributes, data);
	}
	public Provider() {
		super();
		String[] attributes = {"name", "cnpj", "email","phone", "address"};
		this.fillable = new HashMap<String, String>();
        this.mapArray(attributes);
	}
	
	static
    {
        setMyClass(Provider.class);
    }
	@Override
	protected void setId(int id) {
		this.id = id;
	}
	
	public void imprimir() {
		System.out.println(id);
	}
}
