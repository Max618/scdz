import java.util.Scanner;
public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void menuInicial() {
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Produto");
		System.out.println("2 - Funcionario");
		System.out.println("3 - Provedor");
		System.out.println("4 - Venda");
		System.out.println("5 - Relatórios");
		System.out.println("0 - Sair");
	}
	
	public static void menuAcao() {
		System.out.println("Escolha uma ação:");
		System.out.println("1 - Inserir novo registro");
		System.out.println("2 - Atualizar algum registro");
		System.out.println("3 - Visualizar algum registro");
		System.out.println("4 - Deletar registro");
		System.out.println("5 - Visualizar todos os registros");
	}
	
	public static void inserirProduto(String[] data) {
		System.out.println("1 - Inserir Produto");
		System.out.print("Digite o nome do produto: ");
		data[0] = scanner.next();
		System.out.print("Digite a quantidade: ");
		data[1] = scanner.next();
		System.out.print("Digite o preco unitário:");
		data[2] = scanner.next();
		System.out.print("Digite o código do fornecedor: ");
		data[3] = scanner.next();
	}
	
	public static void atualizarProduto(String[] data) {
		System.out.print("Digite o nome do produto: ");
		data[0] = scanner.next();
		System.out.print("Digite a quantidade: ");
		data[1] = scanner.next();
		System.out.print("Digite o preco unitário:");
		data[2] = scanner.next();
		System.out.print("Digite o código do fornecedor: ");
		data[3] = scanner.next();
	}


	public static void main(String[] args) {
		 java.awt.EventQueue.invokeLater(new Runnable() {
	          public void run() {
	               IndexView frame = new IndexView();
	               frame.setVisible(true);
	          }
	    });
		/* int opcao_entidade;
		int opcao_acao;
		int id;
		String[] data = new String[10];
		Product p;
		System.out.println("Bem vindo ao SCDZ!");
		do {
			menuInicial();
			opcao_entidade = scanner.nextInt();
		}while(opcao_entidade < 0 || opcao_entidade > 5);
		if(opcao_entidade == 0) {
			System.out.println("Até logo!");
			return;
		}
		do {
			menuAcao();
			opcao_acao = scanner.nextInt();
		}while(opcao_acao > 5 || opcao_acao < 0);
		
		switch(opcao_entidade) {
			case 1:
				System.out.println("Menu Produto");
				switch(opcao_acao) {
					case 1:
						p = new Product();
						inserirProduto(data);
						p.create(data);
						System.out.println("Produto inserido com sucesso!");
					break;
					case 2:
						p = new Product();
						System.out.println("2 - Atualizar Produto");
						System.out.print("Digite o codigo do produto: ");
						id = scanner.nextInt();
						atualizarProduto(data);
						p.update(data,id);
						System.out.println("Produto atualizado com sucesso!");
					break;
					case 3:
						p = new Product();
						System.out.println("3 - Visualizar Produto");
						System.out.print("Digite o codigo do produto: ");
						id = scanner.nextInt();
						p.find(id);
						p.imprimir();
					break;
					case 4: 
						p = new Product();
						System.out.println("4 - Deletar Produto");
						System.out.print("Digite o codigo do produto: ");
						id = scanner.nextInt();
						p.delete(id);
						System.out.println("Produto deletado com sucesso!");
					break;
					case 5:
						System.out.println("Em construcao :(");
					break;
				}
			break;
		}*/
	}

}
