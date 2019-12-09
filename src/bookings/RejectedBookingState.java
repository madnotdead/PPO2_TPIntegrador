package bookings;

public class RejectedBookingState implements IBookingState {

	@Override
	public void approve(Booking booking) {
		throw new IllegalStateException("Can't Approve a Rejected Booking");
	}

	@Override
	public void cancel(Booking booking) {
		throw new IllegalStateException("Can't Cancel a Rejected Booking");
	}

	@Override
	public void reject(Booking booking) {
		// Do nothing
	}
	
	@Override
	public Boolean isPending() { return false; }

	@Override
	public Boolean isApproved() { return false; }

	@Override
	public Boolean isRejected() { return true; }

	@Override
	public Boolean isCancelled() { return false; }

}
