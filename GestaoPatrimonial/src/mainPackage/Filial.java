package mainPackage;

import java.util.List;
import java.util.ArrayList;

public class Filial extends Enterprises {
	
	// ATRIBUTES
	private int value;
	private List<Patrimony> patrimony;
	
	//Constructor
	
	public Filial(String name) {
		this(name,null);
	}
	
	public Filial(String name, Address adress) {
		setName(name);
		setAddress(adress);
		setPatrimony(new ArrayList<Patrimony>());
	}

	// GETTERS AND SETTERS
	
	public void setPatrimony(ArrayList<Patrimony> patrimony) {
		this.patrimony = patrimony;
	}

	public List<Patrimony> getPatrimony() {
		return patrimony;
	}
	
	//Methods
	
	//Into a Filial create a Patrimony with all arguments
	public void creatV(String name, double value) {
		patrimony.add(new Vehicle(name, value));
	}
	
	public void creatB(String name, double value) {
		patrimony.add(new Buildings(name, value));
	}

	//Into a Filial add a Patrimony
	public void add(Patrimony patrimony) {
		this.patrimony.add(patrimony);
	}
	
	//Into a Filial create a Patrimony only with name 
	public void createV(String name) {
		patrimony.add(new Vehicle(name));
	}
	
	public void createB(String name) {
		patrimony.add(new Buildings(name));
	}
	
	//Into a Filial edit the name of a Patrimony
	public void editPatrimony(String oldName, String newName) {
		for (int i = 0; i < getPatrimony().size(); i++) {
			if(getPatrimony().get(i).getName().equals(oldName)){
				getPatrimony().get(i).edit(newName);
			}
		}
	}
	
	//Into a Filial edit the value of a Patrimony
	public void editPatrimony(String oldName, double newValue) {
		for (int i = 0; i < getPatrimony().size(); i++) {
			if(getPatrimony().get(i).getName().equals(oldName)){
				getPatrimony().get(i).edit(newValue);
			}
		}
	}
	
	public void editEspecificPatrimony(Patrimony patrimony ,String name, Address address, int amount,
			double value, String newModel, String newBrand, int productionYear, int floorsQTD, double area) {
		
		if(name != null) {
			patrimony.setName(name);
		}
		
		if(amount != patrimony.getAmount()) {
			patrimony.setAmount(amount);
		}
		
		if(value != patrimony.getValue()) {
			patrimony.setValue(value);
		}
		
		if( patrimony instanceof Vehicle) {
			
			Vehicle v = (Vehicle) patrimony;
			
			if(newModel != null) {
				v.setModel(newModel);
			}
			
			if(newBrand != null) {
				v.setBrand(newBrand);
			}
			
			v.setProductionYear(productionYear);
			
			
		}else if( patrimony instanceof Buildings) {
			Buildings b = (Buildings) patrimony;
			b.setFloorsQtd(floorsQTD);
			b.setArea(area);
			b.setAddress(address);
		} else {
		
		}
		
	}
	
	//Into a Filial edit the amount of a Patrimony
	public void editPatrimony(String patName, int amount) {
		for(int i = 0; i < getPatrimony().size();i++) {
			if(getPatrimony().get(i).getName().equals(patName)) {
				getPatrimony().get(i).edit(amount);
			}
		}
	}

	//Into a Filial remove a Patrimony
	public void remove(String patName) {
		for (int i = 0; i < getPatrimony().size(); i++) {
			if (getPatrimony().get(i).getName().equals(patName)) {
				getPatrimony().remove(getPatrimony().get(i));
			}
		}
	}

	//method toString that returns the Filial name, the Adress and the Array of Patrimony into a formated String  
	public String toString() {
		String filial = String.format("Nome: %s\nEndereco: %s\nPatrimonios registrados:\n",getName(),getAddress().toString());
		for(int i = 0; i < patrimony.size(); i++) {
			filial = filial.concat(getPatrimony().get(i).toString());
			filial = filial.concat("\n");
		}
		return filial;
	}
	
	public double getValue() {
		double value = 0;
		
		for(int i = 0; i < getPatrimony().size(); i++) {
			value += getPatrimony().get(i).getValue() * getPatrimony().get(i).getAmount() ;
		}
		
		return value;
	}
	

	public int getAmount() {
		int amount = 0;
		
		for(int i = 0; i < getPatrimony().size(); i++) {
			amount  += getPatrimony().get(i).getAmount();
		}
		
		return amount;
	}
}