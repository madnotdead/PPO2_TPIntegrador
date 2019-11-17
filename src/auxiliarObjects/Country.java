package auxiliarObjects;

public class Country {
	private String name;

	public Country(final String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public boolean equals(Object other) {
		boolean result = false;
        if (other instanceof Country) {
        	Country that = (Country) other;
            result = (this.name == that.getName());
        }
        return result;
    }
    @Override
    public int hashCode() {
        return (41 * (41 + this.name.hashCode()));
    }
}
