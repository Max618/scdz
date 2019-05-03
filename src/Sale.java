
public class Sale extends Model{
	
	protected int id;

	public Sale(String[] attributes, String[] data) {
		super(attributes, data);
	}
	@Override
	protected void setId(int id) {
		this.id = id;
	}

}
