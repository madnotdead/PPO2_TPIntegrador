package auxiliarObjects;

public class Service {
	private String name;

	public Service(final String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public boolean equals(Object other) {
		boolean result = false;
        if (other instanceof Service) {
        	Service that = (Service) other;
            result = (this.name == that.getName());
        }
        return result;
    }
    @Override
    public int hashCode() {
        return (31 * (31 + this.name.hashCode()));
    }

}
