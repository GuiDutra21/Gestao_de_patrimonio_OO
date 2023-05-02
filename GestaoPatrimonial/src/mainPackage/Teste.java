package mainPackage;
import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//criando uma compania
		Company company1 = new Company("Ricardo Eletro",new Adress("Brasil",
				"Sao Paulo","Sao Paulo","avenida das palmeiras",15));
		
		//mostrando o estado da companhia
		System.out.println("Print 1 - Mostrando o estado da companhia");
		System.out.println(company1.toString());
		
		//editando o nome da companhia e o endereço 
		company1.edit("Apple");
		company1.edit(new Adress("Estados Unidos","Texas","Dallas","chitaozinho",10));
		
		//mostrando a alteração do estado
		System.out.println("Print 2 - Mostrando a alteracao do estado");
		System.out.println(company1.toString());
		
		//Criando filiais 
		company1.createFilial("Loja 1",new Adress("Estados Unidos","New York",
				"New York city","Time Square",1));
		company1.createFilial("Loja 2",new Adress("Estados Unidos","Florida",
				"Miami","Orla",5));
		company1.createFilial("Loja 3",new Adress("Estados Unidos","California",
				"San Andreas","avenidas das palmeiras",777));
		
		
		//Mostrar o estado da companhia e o da filial
		System.out.println("Print 3 - Mostrando o estado da companhia e o da filial");
		System.out.println(company1.toString());
		for(int i = 0; i < company1.getFilials().size(); i++)
		System.out.println(company1.getFilials().get(i).toString());
		
		//removendo uma Filial
		company1.remove("Loja 2");
		
		//Mostrar a alterção do estado da Companhia e da Filial
		System.out.println("Print 4 - Mostarando a altercao do estado da Companhia e Filial");
		System.out.println(company1.toString());
		for(int i = 0; i < company1.getFilials().size(); i++)
		System.out.println(company1.getFilials().get(i).toString());
		
		//editando uma companhia
		company1.editFilial("Loja 1","Loja 1 com nome novo");
		company1.editFilial("Loja 1 com nome novo",
				new Adress("Brasil", "Minas Gerais", "Belo Horizonte", "Rua pao de Queijo", 56789));
		
		//Mostrar as alterações do estado da Companhia e da Filial
		System.out.println("Print 5- Mostrar as alteracoes do estado da Companhia e da Filial");
		System.out.println(company1.toString());
		for(int i = 0; i < company1.getFilials().size(); i++)
		System.out.println(company1.getFilials().get(i).toString());
		
		//Criando patrimonios
		company1.add("Loja 3", new Patrimony("Carro", 100000));
		company1.add("Loja 3", new Patrimony("Predio", 20000000));
		company1.add("Loja 1 com nome novo", new Patrimony("aviao", 34567890));
		company1.add("Loja 1 com nome novo", new Patrimony("casa", 1298980));
		
		//Mostrar as alterações
		System.out.println("Print 6 - Mostrando as alteracoes");
		for(int i = 0; i < company1.getFilials().size(); i++)
			System.out.println(company1.getFilials().get(i).toString());
		
		
		//Editando patrimonio 
		company1.edit("Loja 3","Carro","Moto");
		company1.edit("Loja 3","Moto", 10500);
		
		//Mostrar as alterações
		System.out.println("Print 7 - Mostrando as alteracoes");
		for(int i = 0; i < company1.getFilials().size(); i++)
			System.out.println(company1.getFilials().get(i).toString());
		
		//Removendo Patrimonio
		company1.remove("Loja 1 com nome novo","casa");
		
		//Mostrar as alterações
		System.out.println("Print 8 - Mostrando as alteracoes");
		for(int i = 0; i < company1.getFilials().size(); i++)
			System.out.println(company1.getFilials().get(i).toString());
		input.close();
	}
}
