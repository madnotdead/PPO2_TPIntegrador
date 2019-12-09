package bookings;

public class PendingBookingState implements IBookingState {

	@Override
	public void approve(Booking booking) {
		booking.approveWhenPending();
	}

	@Override
	public void cancel(Booking booking) {
		booking.setState(new CancelledBookingState());

	}

	@Override
	public void reject(Booking booking) {
		booking.setState(new RejectedBookingState());
	}
	
	@Override
	public Boolean isPending() { return true; }

	@Override
	public Boolean isApproved() { return false; }

	@Override
	public Boolean isRejected() { return false; }

	@Override
	public Boolean isCancelled() { return false; }
}
