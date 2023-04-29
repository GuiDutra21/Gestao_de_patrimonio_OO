package mainPackage;

public class Adress {
	
	private String country;
	private String state;
	private String city;
	private String street;
	private int number;

	// GETTERS AND SETTERS

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreet() {
		return street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setNumber(int number) {
		if (number >= 0) {
			this.number = number;
		} else {
			this.number = 0;
		}
	}

	public int getNumber() {
		return number;
	}

	// Construct

	public Adress(String country, String state, String city, String street, int number) {
		this.setCountry(country);

		this.setState(state);

		this.setCity(city);

		this.setStreet(street);

		this.setNumber(number);
	}
	
	public String toString() {
		String adress = String.format("Adress : %s, %s, %s, %s, %d",getCountry(), getState(), getCity(), getStreet(), getNumber());
		return adress;
	}

}
