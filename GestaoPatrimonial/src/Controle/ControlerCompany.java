package Controle;
import java.util.ArrayList;
import java.util.List;

import mainPackage.Company;
import mainPackage.Filial;
import mainPackage.Patrimony;
import mainPackage.Vehicle;
import view.CompanyMenu;
import mainPackage.Address;
import mainPackage.Buildings;

public class ControlerCompany {
	private Company company;
	private List<String> filialsName;
	private List<String> patrimonyName;
	private String companyName;
	
	public ControlerCompany(String name) {
		this.company = new Company(name);
		this.companyName = name;
		this.filialsName = new ArrayList<>();
		this.patrimonyName = new ArrayList<>();
	}
	
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public Company getCompany() {
		return company;
	}
	
	public List<String> getFilialsName() {
		List <String> nomes = new ArrayList<>();
		
		for(int i = 0; i < getCompany().getFilials().size(); i++) {
			for(int j = 0; j < getCompany().getFilials().get(i).getPatrimony().size(); j++) {
				nomes.add(getCompany().getFilials().get(i).getPatrimony().get(j).getName());
			}
		}
		
		filialsName = nomes;
		return nomes;
	}
	
	public List<String> getPatrimonyName() {
		return patrimonyName;
	}
	
	public void login(String pais, String estado, String cidade, String rua, int numero) {
		Address a = new Address(pais,estado,cidade,rua,numero);
		company.setAddress(a);
		
	}
	
	public boolean cadastrarPatrimony(String filialName, Patrimony p,String name, Address address, int amount,
			double value, String Model, String Brand, int productionYear, int floorsQTD, double area) 
	{
		boolean verifica = false;
		p.setName(name);
		p.setAmount(amount);
		p.setValue(value);
		
		if(p instanceof Vehicle) {
			Vehicle v = (Vehicle) p;
			v.setBrand(Brand);
			v.setModel(Model);
			v.setProductionYear(productionYear);
			
			company.add(filialName, v);
			
			verifica = true;
			
		} else if (p instanceof Buildings) {
			Buildings b = (Buildings) p;
			b.setAddress(address);
			b.setArea(area);
			b.setFloorsQtd(floorsQTD);
			verifica = true;
			
		}
		
		getCompany().add(filialName, p);
		
		return verifica;
	}
	
	public boolean removePatrimony(Filial f, Patrimony p) {
		boolean verifica = false;
		for(int i = 0; i < getCompany().getFilials().size(); i++) {
			if(getCompany().getFilials().get(i) == f) {
				verifica = f.remove(p);
			}
		}
		
		return verifica;
	}
	
	public boolean removeFilial(Filial f) {
		
		return getCompany().remove(f);
		
	}
	
	public boolean cadastrarFilial(String nome, Address address) {
		if(nome != null) {
			getCompany().createFilial(nome, address);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean removeFilial(String name) {
		if(getCompany().remove(name)) {
			return true;
		} else {
			return false;
		}
			
	}
	
	public void companyScreean(int qtdFilials) {
		new CompanyMenu(qtdFilials,this);
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String name) {
		company.setName(name);
		this.companyName = name;
	}
	
	public String getCompanyAddress() {
		return company.getAddress().toString();
	}
	
	
	

	
	

	


	
	
	
	
}
