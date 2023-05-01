package mainPackage;

public class Patrimony {
	private String name;
	private double value;
	
	// GETTERS AND SETTERS
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setValue(double value) {
		if(value < 0) {
			this.value = 0;
		} else {
			this.value = value;
		}
	}

	public double getValue() {
		return value;
	}

	public Patrimony() {

	}

	public Patrimony(String name) {
		setName(name);
	}

	public Patrimony(String name, double value) {
		this.setName(name);
		this.setValue(value);
	}
	
	public String toString() {
		String patrimony = String.format("Nome: %s Valor: %.2f",getName(),getValue());
		return patrimony;
	}
	
	public void edit(String name) {
		setName(name);
	}
	
	public void edit(double value) {
		setValue(value);
	}
	
	public void edit(String name, double value) {
		setName(name);
		setValue(value);
	}
}
