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
	
	//Constructors
	public Patrimony() {

	}

	public Patrimony(String name) {
		setName(name);
	}

	public Patrimony(String name, double value) {
		this.setName(name);
		this.setValue(value);
	}
	
	//Method that edits the name 
	public void edit(String name) {
		setName(name);
	}
	
	//Method that edits the value
	public void edit(double value) {
		setValue(value);
	}
	
	//Method that edits the name and the value
	public void edit(String name, double value) {
		setName(name);
		setValue(value);
	}
	
	//Method toString that returns the name and value of a Patrimony into a formated String
	public String toString() {
		String patrimony = String.format("Nome: %s Valor: %.2f",getName(),getValue());
		return patrimony;
	}
}
