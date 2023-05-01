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
	
	public void editFilial(Adress oldAdress, Adress newAdress) {
		for(int i = 0; i < getFilials().size(); i++) {
			if(getFilials().get(i).getAdress().equals(oldAdress)) {
				oldAdress = newAdress;
			}
		}
	}
	
	public void createFilial(String name) {
		filials.add(new Filial(name));
	}
	
	public void edit(String name) {
		setName(name);
	}
	
	
	
	
}