package Controle;
import java.util.ArrayList;
import java.util.List;

import mainPackage.Company;
import mainPackage.Address;

public class ControlerCompany {
	private Company company;
	private List<String> filialsName;
	private List<String> patrimonyName;
	
	public ControlerCompany(Company company) {
		this.company = company;
		this.filialsName = new ArrayList<>();
		this.patrimonyName = new ArrayList<>();
	}
	
	public boolean login(String name, String pais, String estado, String cidade, String rua, int numero) {
		Address a = new Address(pais,estado,cidade,rua,numero);
		company.setAddress(a);
		if(name != null) {
			company.setName(name);
			return true;
		} else {
			return false;
		}
	}
	

	


	
	
	
	
}
