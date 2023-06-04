package mainPackage;

import java.util.List;
import java.util.ArrayList;

public class Company extends Enterprises {
	
	// ATRIBUTES
	
	private List<Filial> filials;
	
	//Constructors
	public Company(String name, Address adress) {
		this.setName(name);
		this.setAddress(adress);
		setFilials(new ArrayList<Filial>());
	}
	
	public Company(String name) {
		this(name, null);
	}

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
	
	//Methods
	
	//Create a Filial name with all arguments
	public void createFilial(String name, Address address) {
		filials.add(new Filial(name, address));
	}
	
	//Create a Filial only with a name
	public void createFilial(String name) {
		filials.add(new Filial(name));
	}
	

	//Add in a Filial a Patrimony
	public void add(String filialName, Patrimony patrimony) { 
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().equals(filialName)) {
				getFilials().get(i).add(patrimony);
			}
		}
	}

	//Edit the name of a Filial
	public void editFilial(String oldName, String newName) {
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().equals(oldName)) {
				getFilials().get(i).setName(newName);
			}
		}
	}
	
	//Edit the Address of a Filial
	public void editFilial(String name, Address newAdress) {
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().equals(name)) {
				getFilials().get(i).edit(newAdress);
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
	
	//Edit the amount of a Patrimony in the Filial name passed
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
	
	@Override
	public String getType() {
		return "Company";
	}
	
	//method toString that returns the name of the Company, the Address and the Array of Filials into a formated String 
	public String toString() {
		String company = String.format("Nome da companhia: %s\nEndereco da Companhia: %s\nFiliais:\n",this.getName(),getAddress().toString());
		
		for(int i = 0; i < filials.size(); i++) {
			company = company.concat(filials.get(i).getName());
			company = company.concat("\n");
		}
		return company;
	}	
	
	@Override
	public int getAmount() {
		int amount = 0;
		
		for(int i = 0; i < getFilials().size(); i++) {
			amount += getFilials().get(i).getAmount();
		}
		
		return amount;
	}
	
	@Override
	public double getValue() {
		double value = 0.0;
		
		for(int i = 0; i < getFilials().size(); i++) {
			for(int j = 0; j < getFilials().get(i).getPatrimony().size(); j++) {
				value += getFilials().get(i).getPatrimony().get(j).getValue();
			}
		}
		
		return value;
	}
}