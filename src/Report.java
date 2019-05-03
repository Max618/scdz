
public class Report extends Model{

	protected int id;

	public Report(String[] attributes, String[] data) {
		super(attributes, data);
	}
	@Override
	protected void setId(int id) {
		this.id = id;
	}
	
}
