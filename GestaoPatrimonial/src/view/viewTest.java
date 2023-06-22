package view;
import mainPackage.Buildings;
import mainPackage.Patrimony;
import mainPackage.Vehicle;
import mainPackage.Company;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

import Controle.ControlerCompany;

public class viewTest {
	public static void main(String[] a)
	{
		//FilialScreen b = new FilialScreen();
		//Login c = new Login();
//		SwingUtilities.invokeLater(() -> {
//          FilialMenu d = new FilialMenu(100);
//     });
//		new PatrimonyScreean(PatrimonyScreean.Tipo.BUILDINGS);
		
		//CompanyMenu g = new CompanyMenu(5);
		Company com = new Company("Joao");
		
		com.createFilial("NIKE");
		com.createFilial("MM");
		
		List<Patrimony> lista = new ArrayList<>();
		ControlerCompany c = new ControlerCompany(com);
		
		for(int i = 0; i < 10; i++)
		{	
			if(i%2 == 0)
			{
			String v = String.format("casa %d",i);
			lista.add(new Buildings(v));
			}else {
			String s = String.format("Carro %d",i);
			lista.add(new Vehicle(s));
			}
		}
		FilialMenu d = new FilialMenu(c,lista.size(), lista, "Nike");
		
	}
}
