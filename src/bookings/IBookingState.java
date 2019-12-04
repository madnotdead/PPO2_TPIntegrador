package bookings;

public interface IBookingState {
	public void approve(Booking booking);
	public void cancel(Booking booking);
	public void reject(Booking booking);
}
