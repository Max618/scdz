import java.util.HashMap;

public class Sale_Product extends Model{
	protected int id;

	public Sale_Product(String[] data) {
		super();
		String[] attributes = {"quantity", "sale_id", "product_id"};
		this.fillable = new HashMap<String, String>();
        this.mapArray(attributes, data);
	}
	public Sale_Product() {
		super();
		String[] attributes = {"quantity", "sale_id", "product_id"};
		this.fillable = new HashMap<String, String>();
        this.mapArray(attributes);
	}
	
	static
    {
        setMyClass(Sale_Product.class);
    }
	@Override
	protected void setId(int id) {
		this.id = id;
	}

}
