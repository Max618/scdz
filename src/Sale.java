import java.util.HashMap;

public class Sale extends Model{
	protected int id;

	public Sale(String[] data) {
		super();
		String[] attributes = {"date", "value", "employee_id"};
		this.fillable = new HashMap<String, String>();
        this.mapArray(attributes, data);
	}
	public Sale() {
		super();
		String[] attributes = {"date", "value", "employee_id"};
		this.fillable = new HashMap<String, String>();
        this.mapArray(attributes);
	}
	
	static
    {
        setMyClass(Sale.class);
    }
	@Override
	protected void setId(int id) {
		this.id = id;
	}

}
