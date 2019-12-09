package bookings;
import static org.mockito.Mockito.*;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bookings.Booking;
import bookings.Listing;
import bookings.User;
class BookingTest {
	Booking booking1;
	Listing listing1;
	User tenant1;
	@BeforeEach
	void setUp(){
		listing1 = mock(Listing.class);
		tenant1 = mock(User.class);
		booking1 = new Booking(listing1, LocalDate.of(2019, 12, 2), LocalDate.of(2019, 12, 9), tenant1);
	}

	@Test
	void testGetListing() {
		assertEquals(listing1, booking1.getListing());
	}

	@Test
	void testGetCheckInDate() {
		assertEquals(LocalDate.of(2019, 12, 2), booking1.getCheckInDate());
	}

	@Test
	void testGetCheckOutDate() {
		assertEquals(LocalDate.of(2019, 12, 9), booking1.getCheckOutDate());
	}

	@Test
	void testGetTenant() {
		assertEquals(tenant1, booking1.getTenant());
	}
	
	@Test
	void testGetState() {
		assertTrue(booking1.getState().isPending());
	}
}
