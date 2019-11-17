package auxiliarObjects;

public class City {
	private String name;
	private Country country;

	public City(final String aName, final Country aCountry) {
		this.name = aName;
		this.country = aCountry;
	}
	public String getName() {
		return this.name;
	}
	
	public Country getCountry() {
		return this.country;
	}

	@Override
	public boolean equals(Object other) {
		boolean result = false;
        if (other instanceof City) {
        	City that = (City) other;
            result = (this.name == that.getName() && this.country.equals(that.getCountry()));
        }
        return result;
    }
    @Override
    public int hashCode() {
        return (53 * (53 + this.name.hashCode() + this.country.hashCode()));
    }

}
