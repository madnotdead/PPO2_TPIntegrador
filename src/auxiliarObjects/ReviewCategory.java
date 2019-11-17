package auxiliarObjects;

public class ReviewCategory {
	private String name;

	public ReviewCategory(final String aName) {
		this.name = aName;
	}
	public String getName() {
		return this.name;
	}

	@Override
	public boolean equals(Object other) {
		boolean result = false;
        if (other instanceof ReviewCategory) {
        	ReviewCategory that = (ReviewCategory) other;
            result = (this.name == that.getName());
        }
        return result;
    }
    @Override
    public int hashCode() {
        return (19 * (19 + this.name.hashCode()));
    }
}
