package mainPackage;

public abstract class Interprises {
	// ATRIBUTES
	private String name;
	private Adress adress;

	// GETTERS AND SETTERS

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public Adress getAdress() {
		return adress;
	}
	public void edit(String name) {
		setName(name);
	}
	
	public void edit(Adress adress) {
		setAdress(adress);
	}
	
	public void edit(String name, Adress adress) {
		setAdress(adress);
		setName(name);
	}
	
	

}