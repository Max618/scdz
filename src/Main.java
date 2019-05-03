
public class Main {

	public static void main(String[] args) {
		String[] array = {"nome1", "email", "senha","endereco","342","123.6"};
		String[] att = {"name", "email", "password","address","cpf","salary"};
		Employee e = new Employee(att, array);
		e.create(array);
	}

}
