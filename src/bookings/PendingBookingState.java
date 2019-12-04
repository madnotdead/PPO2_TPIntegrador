package bookings;

public class PendingBookingState implements IBookingState {

	@Override
	public void approve(Booking booking) {
		booking.setState(new ApprovedBookingState());

	}

	@Override
	public void cancel(Booking booking) {
		booking.setState(new CancelledBookingState());

	}

	@Override
	public void reject(Booking booking) {
		booking.setState(new RejectedBookingState());
	}

}
