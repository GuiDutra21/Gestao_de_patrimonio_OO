package mainPackage;

public class Patrimony {
	private String name;
	private double value;
	private int amount;
	
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
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		if(amount <= 0) {
			this.amount = 1;	
		} else {
			this.amount = amount;
		}
	
	}
	
	//Constructors
	public Patrimony() {
		setAmount(1);
		setValue(0);
	}

	public Patrimony(String name) {
		setName(name);
		setAmount(1);
		setValue(0);
	}

	public Patrimony(String name, double value) {
		this.setName(name);
		this.setValue(value);
		setAmount(1);
	}
	
	public Patrimony(String name, int amount) {
		setName(name);
		setAmount(amount);
		setValue(0);
	}
	
	public Patrimony(String name, int amount, double value) {
		setName(name);
		setAmount(amount);
		setValue(value);
	}
	
	//Method that edits the name 
	public void edit(String name) {
		setName(name);
	}
	
	//Method that edits the value
	public void edit(double value) {
		setValue(value);
	}
	
	public void edit(int amount) {
		setAmount(amount);
	}
	
	//Method that edits the name and the value
	public void edit(String name, double value) {
		setName(name);
		setValue(value);
	}
	
	public void edit(String name, int amount) {
		setName(name);
		setAmount(amount);
	}
	
	public void edit(int amount, double value) {
		setAmount(amount);
		setValue(value);
	}
	
	public void edit(String name, int amount, double value) {
		setName(name);
		setAmount(amount);
		setValue(value);
	}
	
	//Method toString that returns the name and value of a Patrimony into a formated String
	public String toString() {
		String patrimony = String.format("Nome: %s, Unidades: %d, Valor unitario: %.2f",getName(),getAmount(),getValue());
		return patrimony;
	}


}
