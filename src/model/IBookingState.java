package model;

public interface IBookingState {
	public void approve();
	public void cancel();
	public void reject();
}
