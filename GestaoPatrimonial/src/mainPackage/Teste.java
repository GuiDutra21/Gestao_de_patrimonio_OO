package mainPackage;

public class Teste {
	public static void main(String[] args) {
		
		
		Adress a = new Adress("Brasil","Alagoas","Maceio","AzulL",23);
		
		System.out.println(a.toString());
		
		Company c = new Company("Nike",a);
		c.addFilial(new Filial("Nike 0"));
		c.addFilial(new Filial("Nike Americanas"));
		
		System.out.println(c.getFilials().get(1).getName());
		
		
		
		
	}
}
