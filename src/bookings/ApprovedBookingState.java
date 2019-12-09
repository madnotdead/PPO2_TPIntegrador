package bookings;

public class ApprovedBookingState implements IBookingState {

	@Override
	public void approve(Booking booking) {
		// Do nothing
	}

	@Override
	public void cancel(Booking booking) {
		booking.setState(new CancelledBookingState());

	}

	@Override
	public void reject(Booking booking) {
		throw new IllegalStateException("Can't Reject an Approved Booking");

	}

	@Override
	public Boolean isPending() { return false; }

	@Override
	public Boolean isApproved() { return true; }

	@Override
	public Boolean isRejected() { return false; }

	@Override
	public Boolean isCancelled() { return false; }

}
