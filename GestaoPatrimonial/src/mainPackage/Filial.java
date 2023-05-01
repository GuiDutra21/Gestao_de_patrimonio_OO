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

	public void add(Patrimony patrimony) {
		this.patrimony.add(patrimony);
		setContPat(getContPat() + 1);
	}

	public void remove(String name) {
		for (int i = 0; i < getContPat(); i++) {
			if (getPatrimony().get(i).getName().equals(name)) {
				getPatrimony().remove(getPatrimony().get(i));
			}
		}
	}

	public void editPatrimony(String oldName, String newName) {
		for (int i = 0; i < getContPat(); i++) {
			if(getPatrimony().get(i).getName().equals(oldName)){
				getPatrimony().get(i).setName(newName);
			}
		}
	}
	
	public void editPatrimony(String oldName, double newValue) {
		for (int i = 0; i < getContPat(); i++) {
			if(getPatrimony().get(i).getName().equals(oldName)){
				getPatrimony().get(i).setValue(newValue);
			}
		}
	}
	
	public void createPat(String name) {
		patrimony.add(new Patrimony(name));
	}
	
	public void creatPat(String name, double value) {
		patrimony.add(new Patrimony(name, value));
	}
	
	public String toString() {
		String filial = String.format("Nome: %s\nPatrimonios registrados:\n",getName());
		for(int i = 0; i < patrimony.size(); i++) {
			filial = filial.concat(getPatrimony().get(i).getName());
			filial = filial.concat("\n");
		}
		return filial;
	}

}