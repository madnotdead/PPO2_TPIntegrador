package bookings;

import java.util.ArrayList;
import java.util.List;

import properties.*;
import rankings.RankingSubsystem;

public class BookingSystem {
	private static BookingSystem uniqueInstance;

	private List<User> users = new ArrayList<User>();

	private List<Listing> listings = new ArrayList<Listing>();
	private List<Booking> bookings = new ArrayList<Booking>();

	private BookingSystem() {}

	public static synchronized BookingSystem getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new BookingSystem();
        }
        return uniqueInstance;
    }
	public static synchronized void reset() {
		uniqueInstance = null;
	}

	public RankingSubsystem rankingSubsystem() {
		return RankingSubsystem.getInstance();
	}
	
	public PropertiesSubsystem propertiesSubsystem() {
		return PropertiesSubsystem.getInstance();
	}

	public void addUser(User aUser) {
		this.users.add(aUser);
	}
	public List<User> getUsers() {
		return users;
	}
	
	public void addListing(Listing aListing) {
		this.listings.add(aListing);
	}
	public List<Listing> getListings() {
		return listings;
	}
	
	public void addBooking(Booking aBooking) {
		this.bookings.add(aBooking);
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	
	public List<Listing> getListingsForPublisher(User publisher) {
		return null; /* TODO completar */
	}
	
	public List<Booking> getBookingsForTenant(User tenant) {
		return null; /* TODO completar */
	}
}
