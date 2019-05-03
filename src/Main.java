
public class Main {

	public static void main(String[] args) {
		String[] array = {"nome1", "email", "senha","endereco","342","123.6"};
		String[] att = {"name", "email", "password","address","cpf","salary"};
		Employee e = new Employee(att, array);
		e.create();
		e.imprimir();
		System.out.println("nome 1 " + e.getName());
		e.setName("novo nome");
		System.out.println("nome 2 "+ e.getName());
	}

}
