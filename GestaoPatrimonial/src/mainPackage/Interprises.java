package mainPackage;

public abstract class Interprises {
	// ATRIBUTES
	private String name;
	private Address address;

	// GETTERS AND SETTERS

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(Address adress) {
		this.address = adress;
	}

	public Address getAddress() {
		return address;
	}
	
	//Method that edits the name
	public void edit(String name) {
		setName(name);
	}
	
	//Method that edits the Address
	public void edit(Address adress) {
		setAddress(adress);
	}
	
	//Method that edits the name ande the Address
	public void edit(String name, Address address) {
		setAddress(address);
		setName(name);
	}
}