package model;
import java.time.*;
import auxiliarObjects.Price;
public class Listing {
	private Property property;
	private LocalTime checkInAndOutTime;
	private Price price;
	private LocalDate availableFrom;
	private LocalDate availableTo;
	private Boolean isActive;
	
	/**
	 * @param property
	 * @param checkInTime
	 * @param price
	 * @param availability
	 */
	public Listing(Property property, LocalTime checkInAndOutTime, Price price, LocalDate startDate, LocalDate endDate) {
		super();
		this.property = property;
		this.checkInAndOutTime = checkInAndOutTime;
		this.price = price;
		this.availableFrom = startDate;
		this.availableTo = endDate;
		this.isActive = true;
	}
	
	public Property getProperty() {
		return property;
	}
	public LocalTime getCheckInTime() {
		return checkInAndOutTime;
	}
	public Price getPrice() {
		return price;
	}
	public void disable(){
		this.isActive = false;
	}
	public LocalDate getAvailableFRom() {
		return availableFrom;
	}
	public LocalDate getAvailableTo() {
		return availableTo;
	}
	
}
