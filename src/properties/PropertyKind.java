package properties;

public class PropertyKind {
	private String name;

	public PropertyKind(final String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public boolean equals(Object other) {
		boolean result = false;
        if (other instanceof PropertyKind) {
        	PropertyKind that = (PropertyKind) other;
            result = (this.name == that.getName());
        }
        return result;
    }
    @Override
    public int hashCode() {
        return (47 * (47 + this.name.hashCode()));
    }

}
