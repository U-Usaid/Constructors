package src;

public class Address {

	String address;
	String newCity;
	String newState;
	int ZIP;
	
	Address(String streetAddress, String city, String state, int ZIPcode){
		this.address = streetAddress;
		this.newCity = city;
		this.newState = state;
		this.ZIP = ZIPcode;
	}
	
	public String getStreetAddress() {
		return address;
		
	}
	
	public String getCity() {
		return newCity;
	}
	
	public String getState() {
		return newState;
	}
	
	public int getZipCode() {
		return ZIP;
	}
	
	
	
}
