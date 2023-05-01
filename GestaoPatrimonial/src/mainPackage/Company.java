package mainPackage;

import java.util.List;
import java.util.ArrayList;

public class Company extends Interprises {
	private List<Filial> filials;
	
	// GETTERS AND SETTERS
	
	public void setFilials(ArrayList<Filial> filials) {
		this.filials = filials;
	}

	public List<Filial> getFilials() {
		return filials;
	}

	public void addFilial(Filial filial) {
		getFilials().add(filial);

	}
	
	//Constructors
	public Company() {
		
	}
	
	public Company(String name, Adress adress) {
		this.setName(name);
		this.setAdress(adress);
		setFilials(new ArrayList<Filial>());
		
	}
	
	public Company(String name) {
		this.setName(name);
		setFilials(new ArrayList<Filial>());
	}
	
	public void editFilial(String oldName, String newName) {
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().equals(oldName)) {
				getFilials().get(i).setName(newName);
			}
		}
	}
	
	public void editFilial(String name, Adress newAdress) {
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().equals(name)) {
				getFilials().get(i).edit(newAdress);
			}
		}
	}
	
	
	// adiciona um patrimonio a uma filial
	public void add(String filialName, Patrimony patrimony) { 
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().equals(filialName)) {
				getFilials().get(i).add(patrimony);
			}
		}
	}
	
	public void edit(String filialName, String oldPatName, String newPatName) {
		for(int i = 0; i < getFilials().size(); i++){
			if(getFilials().get(i).getName().equals(filialName)) {
				getFilials().get(i).editPatrimony(oldPatName,newPatName);
			}
		}
	}
	
	public void edit(String filialName, String patName, double newPatValue) {
		for(int i = 0; i < getFilials().size(); i++){
			if(getFilials().get(i).getName().equals(filialName)) {
				getFilials().get(i).editPatrimony(patName,newPatValue);
			}
		}
	}
	
	public void remove(String filialName) {
		filialName = filialName.toLowerCase();
		for(int i = 0; i < filials.size(); i++) {
			if(filials.get(i).getName().toLowerCase().equals(filialName)) {
				filials.remove(i);
			}
		}
	}
	
	public void remove(String filialName, String patrimonyName) {
		filialName = filialName.toLowerCase();
		for(int i = 0; i < filials.size(); i++) {
			for(int j = 0; j < filials.get(i).getPatrimony().size(); i++) {
				if(filials.get(i).getPatrimony().get(i).getName().equals(patrimonyName)) {
					filials.get(i).getPatrimony().remove(filials.get(i).getPatrimony().get(i));
				}
			}
		}
	}
	
	public void createFilial(String name) {
		filials.add(new Filial(name));
	}
	
	public void createFilial(String name, Adress adress) {
		filials.add(new Filial(name, adress));
	}
	
	public String toString() {
		String company = String.format("Nome da companhia: %s\nEndereco da Companhia: %s\nFiliais:\n",this.getName(),getAdress().toString());
		
		for(int i = 0; i < filials.size(); i++) {
			company = company.concat(filials.get(i).getName());
			company = company.concat("\n");
			
		}
		
		return company;
	}
	

	
		
}