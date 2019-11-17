package auxiliarObjects;

public class Currency {
	private String name;

	public Currency(final String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public boolean equals(Object other) {
		boolean result = false;
        if (other instanceof Currency) {
        	Currency that = (Currency) other;
            result = (this.name == that.getName());
        }
        return result;
    }
    @Override
    public int hashCode() {
        return (53 * (53 + this.name.hashCode()));
    }
}
