package model;
import static org.mockito.Mockito.*;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
		assertEquals(booking1.getListing(), listing1);
	}

	@Test
	void testGetCheckInDate() {
		assertEquals(booking1.getCheckInDate(), LocalDate.of(2019, 12, 2));
	}

	@Test
	void testGetCheckOutDate() {
		assertEquals(booking1.getCheckOutDate(), LocalDate.of(2019, 12, 9));
	}

	@Test
	void testGetTenant() {
		assertEquals(booking1.getTenant(), tenant1);
	}
}
