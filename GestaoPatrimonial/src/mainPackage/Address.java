
package mainPackage;

public class Address {
	
	// ATRIBUTES
	
	private String country;
	private String state;
	private String city;
	private String street;
	private int number;

	// Construct

	public Address(String country, String state, String city, String street, int number) {
		this.setCountry(country);

		this.setState(state);

		this.setCity(city);

		this.setStreet(street);

		this.setNumber(number);
	}
	
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

	///
	//method toString that returns the elements of an Address into a formated a String
	public String toString() {
		String address = null;
		if(getCountry() == null && getState() == null && getCity() == null && getStreet() == null ){
			
			address = "Nao informado";
			
		} else if(getCountry() != null && getState() == null && getCity() == null && getStreet() == null ){
			
			address = String.format("%s",getCountry());
			
		} else if(getCountry() != null && getState() != null && getCity() == null && getStreet() == null ){
			
			address = String.format("%s, %s",getCountry(), getState());
			
		} else if(getCountry() != null && getState() != null && getCity() != null && getStreet() == null ){
			
			address = String.format("%s, %s, %s",getCountry(), getState(), getCity());
			
		} else if(getCountry() != null && getState() != null && getCity() != null && getStreet() != null ){
			
			address = String.format("%s, %s, %s, %s, %d",getCountry(), getState(), getCity(), getStreet(), getNumber());
			
		} else {
			address = String.format("%s, %s, %s, %s, %d",getCountry(), getState(), getCity(), getStreet(), getNumber());
		}
		
		
		return address;
	}	
}