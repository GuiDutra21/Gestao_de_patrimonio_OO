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

	public boolean addFilial(Filial filial) {
		boolean verifica = false;
		
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().toLowerCase().equals(filial.getName().toLowerCase())) {
				
			} else {
				getFilials().add(filial);
				verifica  = true;
			}
		}
		
		return verifica;
		
	}
	
	//Methods
	
	//Create a Filial name with all arguments
	public boolean createFilial(String name, Address address) {
		boolean verifica = false;
		
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().toLowerCase().equals(name.toLowerCase())) {
				
			} else {
				filials.add(new Filial(name, address));
				verifica  = true;
			}
		}
		
		return verifica;
		
	}
	
	//Create a Filial only with a name
	public boolean createFilial(String name) {
		boolean verifica = false;
		
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().toLowerCase().equals(name.toLowerCase())) {
				
			} else {
				filials.add(new Filial(name));
				verifica  = true;
			}
		}
		
		return verifica;
		
	}
	

	//Add in a Filial a Patrimony
	public boolean add(String filialName, Patrimony patrimony) { 
		boolean verifica = false;
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().equals(filialName)) {
				verifica = getFilials().get(i).add(patrimony);
			}
		}
		
		return verifica;
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
	
	public void edit(String filialName, Patrimony patrimony ,String name, Address address, int amount,
			double value, String newModel, String newBrand, int productionYear, int floorsQTD, double area) {
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getName().equals(filialName)) {
				getFilials().get(i).edit(patrimony ,name,address,amount,
						value, newModel, newBrand,productionYear,floorsQTD, area);
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
	public boolean remove(String filialName) {
		boolean verifica = false;
		
		filialName = filialName.toLowerCase();
		for(int i = 0; i < filials.size(); i++) {
			if(filials.get(i).getName().toLowerCase().equals(filialName)) {
				filials.remove(i);
				verifica = true;
			}
			
		}
		
		return verifica;
	}
	
	//remove a Patrimony name based in the Filial name passed
	public boolean remove(String filialName, String patrimonyName) {
		
		boolean verifica = false;
		
		for(int i = 0; i < filials.size(); i++) {
			
			if(filials.get(i).getName().toLowerCase().equals(filialName.toLowerCase())) {
				for(int j = 0; j < filials.get(i).getPatrimony().size(); j++) {
					if(filials.get(i).getPatrimony().get(j).getName().toLowerCase().equals(patrimonyName.toLowerCase())){
						verifica = filials.get(i).remove(patrimonyName);
					}
				}
				
			}
		
		}
		
		return verifica;
	}	
	
	//method toString that returns the name of the Company, the Address and the Array of Filials into a formated String 
	public String toString() {
		String company = String.format("Nome da companhia: %s\nEndereco da Companhia: %s\n"
				+ "Filiais:\n",this.getName(),getAddress().toString());
		
		for(int i = 0; i < filials.size(); i++) {
			company = company.concat(filials.get(i).getName());
			company = company.concat("\n");
		}
		return company;
	}	
	

	public int getAmount() {
		return getFilials().size();
	}
	
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