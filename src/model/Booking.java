package model;

import java.time.LocalDate;

/* Booking/Reserva:
Estados
	Cancelada
	Finalizada
*/
public class Booking {
	private Listing listing;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private User tenant;
	private BookingState state;
	/**
	 * @param listing
	 * @param checkInDate
	 * @param checkOutDate
	 * @param tenant
	 */
	public Booking(Listing listing, LocalDate checkInDate, LocalDate checkOutDate, User tenant) {
		super();
		this.listing = listing;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.tenant = tenant;
		this.state = new BookingState("Pending Aproval");
	}
	public Listing getListing() {
		return listing;
	}
	public LocalDate getCheckInDate() {
		return checkInDate;
	}
	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}
	public User getTenant() {
		return tenant;
	}
	public BookingState getState() {
		return state;
	}
	
	
}
