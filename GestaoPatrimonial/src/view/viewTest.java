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
	public static void main(String[] args)
	{
		
		//Login l = new Login();
		
		ArrayList<Patrimony> pats = new ArrayList<>();
		ArrayList<String> nomes = new ArrayList<>();
		for(int i = 0; i < 6; i++)
		{
			pats.add(new Vehicle("teste carro"));
			pats.add(new Buildings("teste predio"));
			nomes.add("um nome qualuqer");
		}
		
		
		SearchedPatrimonys k = new SearchedPatrimonys(pats,nomes,"ameba", 6);
		
	}
}
