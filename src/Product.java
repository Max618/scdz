import java.util.HashMap;

public class Product extends Model{
	protected int id;

	public Product(String[] data) {
		super();
		String[] attributes = {"name", "quantity", "price","provider_id"};
		this.fillable = new HashMap<String, String>();
        this.mapArray(attributes, data);
	}
	public Product() {
		super();
		String[] attributes = {"name", "quantity", "price","provider_id"};
		this.fillable = new HashMap<String, String>();
        this.mapArray(attributes);
	}
	
	static
    {
        setMyClass(Product.class);
    }
	@Override
	protected void setId(int id) {
		this.id = id;
	}
	
}
