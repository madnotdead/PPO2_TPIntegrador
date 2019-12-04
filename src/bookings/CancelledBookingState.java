package bookings;

public class CancelledBookingState implements IBookingState {

	@Override
	public void approve(Booking booking) {
		throw new IllegalStateException("Can't approve a Cancelled booking");

	}

	@Override
	public void cancel(Booking booking) {
		// Do nothing

	}

	@Override
	public void reject(Booking booking) {
		throw new IllegalStateException("Can't Reject a Calncelled booking");

	}

}
