package model;

public class BookingState {
	private String name;

	/**
	 * @param name
	 */
	public BookingState(String name) {
		super();
		this.name = name;
	}

	public String type() {
		return name;
	}
}
