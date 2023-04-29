package mainPackage;

import java.util.List;
import java.util.ArrayList;

public class Company extends Interprises {
	private List<Filial> filials;
	private int qtd;
	
	// GETTERS AND SETTERS
	
	public void setQtd(int qtd) {
		if(qtd < 0) {
			this.qtd = 0;
		} else {
			this.qtd = qtd;
		}
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setFilials(ArrayList<Filial> filials) {
		this.filials = filials;
	}

	public List<Filial> getFilials() {
		return filials;
	}

	public void addFilial(Filial filial) {
		getFilials().add(filial);
		setQtd(getQtd() + 1);

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
	
	
	
	
}