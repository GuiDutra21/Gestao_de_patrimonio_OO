package view;
import mainPackage.Patrimony;
import mainPackage.Vehicle;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

public class viewTest {
	public static void main(String[] a)
	{
		//FilialScreen b = new FilialScreen();
		//Login c = new Login();
//		SwingUtilities.invokeLater(() -> {
//          FilialMenu d = new FilialMenu(100);
//     });
//		new PatrimonyScreean(PatrimonyScreean.Tipo.BUILDINGS);
		List<Patrimony> lista = new ArrayList<>();
		
		for(int i = 0; i < 10; i++)
		{
			String v = String.format("carro %d",i);
			lista.add(new Vehicle(v));
		}
		FilialMenu d = new FilialMenu(lista.size(), lista);
		
	}
}
