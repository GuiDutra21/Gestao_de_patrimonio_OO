package mainPackage;
import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*Adress a = new Adress("Brasil","Alagoas","Maceio","AzulL",23);
		
		System.out.println(a.toString());
		
		Company c = new Company("Nike",a);
		c.addFilial(new Filial("Nike 0"));
		c.addFilial(new Filial("Nike Americanas"));
		
		System.out.println(c.getFilials().get(1).getName());
		
		c.getFilials().get(0).add(new Patrimony("carro",1200));
		
		System.out.println(c.getFilials().get(0).getPatrimony().toString()); */
		
		Company c = new Company("Nike");
		
		c.addFilial(new Filial("Nike Br"));
		
		c.addFilial(new Filial("Nike EUA"));
		
		c.getFilials().get(0).add(new Patrimony("Carro",50000.00));
		c.getFilials().get(0).add(new Patrimony("Moto",25000.00));
		

		
		c.getFilials().get(1).add(new Patrimony("Apt", 500000));
		
		System.out.println(c.getFilials().get(0).getPatrimony().get(0).toString());
		System.out.println(c.getFilials().get(0).getPatrimony().get(1).toString());
		System.out.println(c.getFilials().get(0).toString());
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
