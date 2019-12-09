package bookings;

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
	private IBookingState state;

	public Booking(Listing listing, LocalDate checkInDate, LocalDate checkOutDate, User tenant) {
		super();
		this.listing = listing;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.tenant = tenant;
		this.state = new PendingBookingState();
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
	public IBookingState getState() {
		return state;
	}
	public void reject() {
		this.state.reject(this);
		
	}
	public void cancel() {
		this.state.cancel(this);
		
	}
	public void approve() {
		this.state.approve(this);
	}
	public void approveWhenPending() {
		this.setState(new ApprovedBookingState());
		this.listing.deactivate();
		BookingSystem.getInstance().sendByEMail(this);
	}
	public void setState(IBookingState bookingState) {
		this.state = bookingState;
		
	}
	
	
}
