package model;
import java.time.*;

public class Listing {
	private Property property;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private LocalDate availableFrom;
	private LocalDate availableTo;
	private Double price;
	private Boolean active;

	public Listing(Property property, LocalDate from, LocalDate to, LocalTime checkIn, LocalTime checkOut, Double price) {
		super();
		this.property = property;
		this.checkInTime = checkIn;
		this.checkOutTime = checkOut;
		this.price = price;
		this.active = true;
		this.availableFrom = from;
		this.availableTo = to;
	}
	
	public LocalDate getAvailableFrom() {
		return availableFrom;
	}

	public LocalDate getAvailableTo() {
		return availableTo;
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

	public Boolean isActive() {
		return active;
	}
}
