package bookings;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalTime;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import properties.PropertiesSubsystem;
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
	
	/* Hito 1 - 2.a */
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
		assertTrue(bookingSystem.getListingsForPublisher(owner).contains(listing));
	}
	
	@Test
	void testAllListingsForOwnerHaveRegisteredProperty() {
		User owner = mock(User.class);
		Property property = mock(Property.class);
		when(property.getOwner()).thenReturn(owner);
		
		bookingSystem.addUser(owner);
		bookingSystem.propertiesSubsystem().addProperty(property);
		
		Listing listing = new Listing(property, LocalDate.now(), LocalDate.now(), LocalTime.now(), LocalTime.now(), 521.75);
		bookingSystem.addListing(listing);
		
		bookingSystem.getListingsForPublisher(owner).forEach(l ->
				assertTrue(PropertiesSubsystem.getInstance().getPropertiesForOwner(owner).contains(l.getProperty())));

	}
	
	/* Hito 1 - 2.c */
	@Test
	void testOwnerAcceptsListingForTenant() {
		User tenant = mock(User.class);
		when(tenant.getEmail()).thenReturn("poo@mail.com");
		Property property = mock(Property.class);

		Listing listing = new Listing(property, LocalDate.of(2019, 6, 1), LocalDate.of(2019, 12, 31), LocalTime.of(10, 00), LocalTime.of(8, 00), 2500.0);
		bookingSystem.addListing(listing);

		// El inquilino hace la reserva. La misma queda en estado pendiente. La publicación sigue activa.
		Booking booking = new Booking(listing, LocalDate.of(2019, 12, 2), LocalDate.of(2019, 12, 9), tenant);;
		bookingSystem.addBooking(booking);
		assertTrue(booking.getState().isPending());
		assertTrue(listing.isActive());

		// El propietario acepta la reserva. La misma queda en estado aprobada. La publicación queda desactivada.
		booking.approve();
		assertTrue(booking.getState().isApproved());
		assertFalse(listing.isActive());
		
		assertTrue(bookingSystem.getBookingsForTenant(tenant).contains(booking));
	}

}
