package bookings;
import java.time.*;

import properties.City;
import properties.Property;

public class Listing {
	private LocalDate creationDate; 
	private Property property;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private LocalDate availableFrom;
	private LocalDate availableTo;
	private Double price;
	private Boolean active;

	public Listing(Property property, LocalDate from, LocalDate to, LocalTime checkIn, LocalTime checkOut, Double price) {
		super();
		this.creationDate = LocalDate.now();
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
	public City getCity() {
		return property.getAddress().getCity();
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
	
	public User getPublisher() {
		return this.property.getOwner();
	}
	
	public Boolean isLastMinutePromotion() {
		return this.creationDate.plusDays(7).equals(this.availableFrom) &&
				(this.availableTo.compareTo(this.creationDate.plusDays(30)) <= 0);
	}
	public Boolean isPlannedPromotion() {
		return this.creationDate.plusDays(180).equals(this.availableFrom);
	}
}
