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
	
	//Edit the name of a Filial
	public void editFilial(String oldName, String newName) {
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().equals(oldName)) {
				getFilials().get(i).setName(newName);
			}
		}
	}
	
	//Edit the Adress of a Filial
	public void editFilial(String name, Adress newAdress) {
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().equals(name)) {
				getFilials().get(i).edit(newAdress);
			}
		}
	}
	
	
	//Adds in a Filial a Patrimony
	public void add(String filialName, Patrimony patrimony) { 
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().equals(filialName)) {
				getFilials().get(i).add(patrimony);
			}
		}
	}
	
	//Edit the name of a Patrimony in the Filial mentioned
	public void edit(String filialName, String oldPatName, String newPatName) {
		for(int i = 0; i < getFilials().size(); i++){
			if(getFilials().get(i).getName().equals(filialName)) {
				getFilials().get(i).editPatrimony(oldPatName,newPatName);
			}
		}
	}
	
	//Edit the value of a Patrimony in the Filial name passed
	public void edit(String filialName, String patName, double newPatValue) {
		for(int i = 0; i < getFilials().size(); i++){
			if(getFilials().get(i).getName().equals(filialName)) {
				getFilials().get(i).editPatrimony(patName,newPatValue);
			}
		}
	}
	
	public void edit(String filialName, String patName, int newPatAmount) {
		for(int i = 0; i < getFilials().size();i++) {
			if(getFilials().get(i).getName().equals(filialName)) {
				getFilials().get(i).editPatrimony(patName,newPatAmount);
			}
		}
	}
	
	//remove a Filial based in it name
	public void remove(String filialName) {
		filialName = filialName.toLowerCase();
		for(int i = 0; i < filials.size(); i++) {
			if(filials.get(i).getName().toLowerCase().equals(filialName)) {
				filials.remove(i);
			}
		}
	}
	
	//remove a Patrimony name based in the Filial name passed
	public void remove(String filialName, String patrimonyName) {
		filialName = filialName.toLowerCase();
		for(int i = 0; i < filials.size(); i++) {
			for(int j = 0; j < filials.get(i).getPatrimony().size(); j++) {
				if(filials.get(i).getPatrimony().get(j).getName().equals(patrimonyName)) {
					filials.get(i).getPatrimony().remove(filials.get(i).getPatrimony().get(j));
				}
			}
		}
	}
	
	//Create a Filial only with a name
	public void createFilial(String name) {
		filials.add(new Filial(name));
	}
	
	//Create a Filial name with all argumnets
	public void createFilial(String name, Adress adress) {
		filials.add(new Filial(name, adress));
	}
	
	//method toString that retunrs the name of the Company, the Adress and the Array of Filials into a formated String 
	public String toString() {
		String company = String.format("Nome da companhia: %s\nEndereco da Companhia: %s\nFiliais:\n",this.getName(),getAdress().toString());
		
		for(int i = 0; i < filials.size(); i++) {
			company = company.concat(filials.get(i).getName());
			company = company.concat("\n");
		}
		return company;
	}
	

	
		
}