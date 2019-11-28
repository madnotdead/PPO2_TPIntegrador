package model;
import java.time.*;

public class Listing {
	private Property property;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private Double price;
	private Boolean active;

	public Listing(Property property, LocalTime checkIn, LocalTime checkOut, Double price) {
		super();
		this.property = property;
		this.checkInTime = checkIn;
		this.checkOutTime = checkOut;
		this.price = price;
		this.active = true;
	}
	
	public Property getProperty() {
		return property;
	}
	public LocalTime getCheckInTime() {
		return checkInTime;
	}
	public LocalTime getCheckOutTime() {
		return checkOutTime;
	}
	public Double getPrice() {
		return price;
	}
	public void deactivate() {
		this.active = false;
	}
}
