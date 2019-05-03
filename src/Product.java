
public class Product extends Model{
	
	protected int id;

	public Product(String[] attributes, String[] data) {
		super(attributes, data);
	}
	@Override
	protected void setId(int id) {
		this.id = id;
	}
	
}
