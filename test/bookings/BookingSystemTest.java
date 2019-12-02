package bookings;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalTime;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import properties.Property;

class BookingSystemTest {

	public BookingSystem bookingSystem;

	@BeforeEach
	void setUp() {
		BookingSystem.reset();
		bookingSystem = BookingSystem.getInstance();
	}

	@Test
	void testUniqueInstance() {
		BookingSystem otherBookingSystem = BookingSystem.getInstance();
		
		assertEquals(bookingSystem, otherBookingSystem);
	}

	@Test
	void testResetInstance() {
		BookingSystem.reset();
		BookingSystem otherBookingSystem = BookingSystem.getInstance();

		assertNotEquals(bookingSystem, otherBookingSystem);
	}
	
	@Test
	void testAddingUser() {
		User user = mock(User.class);
		
		bookingSystem.addUser(user);
		assertTrue(bookingSystem.getUsers().contains(user));
	}

	@Test
	void testAddingListing() {
		Listing listing = mock(Listing.class);
		
		bookingSystem.addListing(listing);
		assertTrue(bookingSystem.getListings().contains(listing));
	}

	@Test
	void testAddingBooking() {
		Booking booking = mock(Booking.class);
		
		bookingSystem.addBooking(booking);
		assertTrue(bookingSystem.getBookings().contains(booking));
	}
	
	@Test
	void testAddingNewPropertyAndListingIt() {
		User owner = mock(User.class);
		Property property = mock(Property.class);
		when(property.getOwner()).thenReturn(owner);
		
		bookingSystem.addUser(owner);
		bookingSystem.propertiesSubsystem().addProperty(property);
		
		Listing listing = new Listing(property, LocalDate.now(), LocalDate.now(), LocalTime.now(), LocalTime.now(), 521.75);
		bookingSystem.addListing(listing);
		
		assertTrue(bookingSystem.getListings().contains(listing));
		assertEquals(bookingSystem.getListings().get(0).getPublisher(), owner);
	}
}
