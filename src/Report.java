import java.util.HashMap;

public class Report extends Model{
	protected int id;

	public Report(String[] data) {
		super();
		String[] attributes = {"type", "start_date", "end_date"};
		this.fillable = new HashMap<String, String>();
        this.mapArray(attributes, data);
	}
	public Report() {
		super();
		String[] attributes = {"type", "start_date", "end_date"};
		this.fillable = new HashMap<String, String>();
        this.mapArray(attributes);
	}
	
	static
    {
        setMyClass(Report.class);
    }
	@Override
	protected void setId(int id) {
		this.id = id;
	}
	
}
