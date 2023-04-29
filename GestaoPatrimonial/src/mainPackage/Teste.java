package mainPackage;
import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
		
		Adress a = new Adress("Brasil","Alagoas","Maceio","AzulL",23);
		
		System.out.println(a.toString());
		
		Company c = new Company("Nike",a);
		c.addFilial(new Filial("Nike 0"));
		c.addFilial(new Filial("Nike Americanas"));
		
		System.out.println(c.getFilials().get(1).getName());
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Seja bem vindo ao Menu!");
		System.out.println("------------------------");
		System.out.print("Informe o nome da sua companinha\nName : ");
		String interpriseName = input.nextLine();
		System.out.println("Informe o endereco da sua empresa");
		System.out.print("Pais : ");
		String interpriseCountry = input.nextLine();
		System.out.print("Estado : ");
		String interpriseState = input.nextLine();
		System.out.print("Cidade : ");
		String interpriseCity = input.nextLine();
		System.out.print("Rua : ");
		String interpriseStreet = input.nextLine();
		System.out.print("Numero : ");
		int intepriseNumber = input.nextInt();
		
		Adress a1 = new Adress(interpriseCountry, interpriseState, interpriseCity, interpriseStreet, intepriseNumber );
		Company company1 = new Company(interpriseName, a1);
		
		while(true)
		{
			System.out.println("Digite a opcao que voce deseja :");
			System.out.println("1 - alterar os dados da empresa\n2 - gerenciar uma filial\n3 - gerenciar patrimonios");
			int option1 = input.nextInt();
			if(option1 != 1 && option1 != 2 && option1 != 3)
			{
				break;
			}
			
			if(option1 == 1)
			{	
				System.out.println("Voce selecionou a primeira opcao !");
				System.out.println("Digite a opcao que voce deseja :");
				System.out.println("1 - alterar o nome\n 2 - alterar o endereco");
				int option2 = input.nextInt();
				if(option2 != 1 && option2 != 2){
					break;
				}
				
				if(option2 == 1){
					
				}
			}
		}		
	}
}
