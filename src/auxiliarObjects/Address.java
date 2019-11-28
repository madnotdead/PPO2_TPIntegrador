package auxiliarObjects;

public class Address {
	
	private City city;
	
	private String street;
	
	private Integer number;
	
	public Address(City city, String street, int number) {
		super();
		this.city = city;
		this.street = street;
		this.number = number;
	}
	

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return this.city.getCountry();
	}

	/**
	 * @return the city
	 */
	public City getCity() {
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
