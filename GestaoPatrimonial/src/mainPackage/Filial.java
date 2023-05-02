package mainPackage;

import java.util.List;
import java.util.ArrayList;

public class Filial extends Interprises {
	private List<Patrimony> patrimony;
	private int contPat;
	
	// GETTERS AND SETTERS
	
	public void setContPat(int contPat) {
		this.contPat = contPat;
	}

	public int getContPat() {
		return contPat;
	}

	public void setPatrimony(ArrayList<Patrimony> patrimony) {
		this.patrimony = patrimony;
	}

	public List<Patrimony> getPatrimony() {
		return patrimony;
	}
	
	//Constructor
	
	public Filial(String name) {
		this.setName(name);
		setContPat(0);
		setPatrimony(new ArrayList<Patrimony>());
	}
	
	public Filial(String name, Adress adress) {
		setName(name);
		setContPat(0);
		setAdress(adress);
		setPatrimony(new ArrayList<Patrimony>());
	}
	
	//Into a Filial adds a Patrimony
	public void add(Patrimony patrimony) {
		this.patrimony.add(patrimony);
		setContPat(getContPat() + 1);
	}
	
	//Into a Filial removes a Patrimony
	public void remove(String patName) {
		for (int i = 0; i < getContPat(); i++) {
			if (getPatrimony().get(i).getName().equals(patName)) {
				getPatrimony().remove(getPatrimony().get(i));
			}
		}
	}
	
	//Into a Filial edit the name of a Patrimony
	public void editPatrimony(String oldName, String newName) {
		for (int i = 0; i < getContPat(); i++) {
			if(getPatrimony().get(i).getName().equals(oldName)){
				getPatrimony().get(i).edit(newName);
			}
		}
	}
	
	//Into a Filial edit the value of a Patrimony
	public void editPatrimony(String oldName, double newValue) {
		for (int i = 0; i < getContPat(); i++) {
			if(getPatrimony().get(i).getName().equals(oldName)){
				getPatrimony().get(i).edit(newValue);
			}
		}
	}
	
	public void editPatrimony(String patName, int amount) {
		for(int i = 0; i < getPatrimony().size();i++) {
			if(getPatrimony().get(i).getName().equals(patName)) {
				getPatrimony().get(i).edit(amount);
			}
		}
	}
	
	//Into a Filial creates a Patrimony only with name 
	public void createPat(String name) {
		patrimony.add(new Patrimony(name));
	}
	
	//Into a Filial creates a Patrimony with all arguments
	public void creatPat(String name, double value) {
		patrimony.add(new Patrimony(name, value));
	}
	
	//method toString that returns the Filial name, the Adress and the Array of Patrimony into a formated String  
	public String toString() {
		String filial = String.format("Nome: %s\nEndereco: %s\nPatrimonios registrados:\n",getName(),getAdress().toString());
		for(int i = 0; i < patrimony.size(); i++) {
			filial = filial.concat(getPatrimony().get(i).toString());
			filial = filial.concat("\n");
		}
		return filial;
	}

}