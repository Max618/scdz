
public class Sale_Product extends Model{
		
	protected int id;

	public Sale_Product(String[] attributes, String[] data) {
		super(attributes, data);
	}
	@Override
	protected void setId(int id) {
		this.id = id;
	}

}
