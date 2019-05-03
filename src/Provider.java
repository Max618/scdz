
public class Provider extends Model{
	protected int id;

	public Provider(String[] attributes, String[] data) {
		super(attributes, data);
	}
	@Override
	protected void setId(int id) {
		this.id = id;
	}
	
	public void imprimir() {
		System.out.println(id);
	}
}
