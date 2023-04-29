package mainPackage;

import java.util.List;
import java.util.ArrayList;

public class Company extends Interprises {
	private List<Filial> filials;
	private int qtd;
	
	// GETTERS AND SETTERS
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
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
		qtd += 1;

	}
	
	//Constructors
	
	public Company(String name, Adress adress) {
		this.setName(name);
		this.setAdress(adress);
		setFilials(new ArrayList<Filial>());
		
	}
	
	public Company(String name) {
		this.setName(name);
		setFilials(new ArrayList<Filial>());
	}

	/*public Filial edit(String name) {
		for (int i = 0; i < qtd; i++) {
			if (this.getFilials().get(i).getName().equals(name)) {
				return this.getFilials().get(i);
			}
			
		}
	}*/
	
	public void printFillias()
	{
		
	}
}