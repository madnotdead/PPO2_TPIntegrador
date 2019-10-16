package model;

public class Address {
	
	private String country;
	
	private String city;
	
	private String street;
	
	private Integer number;
	
	
	/**
	 * @param country
	 * @param city
	 * @param street
	 */
	public Address(String country, String city, String street, int number) {
		super();
		this.country = country;
		this.city = city;
		this.street = street;
		this.number = number;
	}
	

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @return the number
	 */
	public Integer getNumber() {
		return number;
	}
}
