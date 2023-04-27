package mainPackage;

import java.util.List;

public class Filial extends Interprises {
	private List<Patrimony> patrimony;
	private int contPat;

	public void setContPat(int contPat) {
		this.contPat = contPat;
	}

	public int getContPat() {
		return contPat;
	}

	public void setPatrimony(List<Patrimony> patrimony) {
		this.patrimony = patrimony;
	}

	public List<Patrimony> getPatrimony() {
		return patrimony;
	}

	public Filial(String name) {
		this.setName(name);
		setContPat(0);
	}

	public void addPatrimony(Patrimony patrimony) {
		this.patrimony.add(patrimony);
		setContPat(getContPat() + 1);
	}

	public void removePatrimony(String name) {
		for (int i = 0; i < getContPat(); i++) {
			if (getPatrimony().get(i).getName().equals(name)) {
				getPatrimony().remove(getPatrimony().get(i));
			}
		}
	}

	public void editPatrimony(String name) {
		for (int i = 0; i < getContPat(); i++) {

		}
	}

	public void edit(String name) {
		setName(name);
	}

	public void edit(Adress adress) {
		setAdress(adress);
	}

}