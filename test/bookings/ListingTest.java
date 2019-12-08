package bookings;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bookings.Listing;
import properties.Address;
import properties.City;
import properties.Property;

class ListingTest {
	Listing listing1;
	User mockOwner;
	Property mockProperty;
	Address mockAddress;
	City mockCity;
	LocalTime rightNow;
	LocalDate today;
	
	@BeforeEach
	void setUp() {
		mockCity = mock(City.class);
		mockAddress = mock(Address.class);
		when(mockAddress.getCity()).thenReturn(mockCity);
		
		mockOwner = mock(User.class);
		mockProperty = mock(Property.class);
		when(mockProperty.getOwner()).thenReturn(mockOwner);
		when(mockProperty.getAddress()).thenReturn(mockAddress);

		rightNow = LocalTime.now();
		today = LocalDate.now();
		listing1 = new Listing(mockProperty,today, today, rightNow, rightNow, 2500.0);
	}
	@Test
	void testGetCity() {
		assertEquals(mockProperty.getAddress().getCity(), listing1.getCity());
	}
	@Test
	void testGetProperty() {
		assertEquals(mockProperty, listing1.getProperty());
	}

	@Test
	void testGetAvailableFrom() {
		assertEquals(today, listing1.getAvailableFrom());
	}
	
	@Test
	void testGetAvailableTo() {
		assertEquals(today, listing1.getAvailableTo());
	}
	
	@Test
	void testGetCheckInTime() {
		assertEquals(rightNow, listing1.getCheckInTime());
	}

	@Test
	void testGetCheckOutTime() {
		assertEquals(rightNow, listing1.getCheckOutTime());
	}

	@Test
	void testGetPrice() {
		assertEquals(2500.0, listing1.getPrice());
	}
	
	@Test
	void testGetPublisher() {
		assertEquals(mockOwner, listing1.getPublisher());
	}
	
	@Test
	void testIsActiveAndThenDeactivate() {
		assertTrue(listing1.isActive());
		listing1.deactivate();
		assertTrue(!listing1.isActive());
	}
	
	@Test
	void testPlannedPromotion() {
		Listing listing2;
		
		assertTrue(!listing1.isPlannedPromotion());
		
		listing2 = new Listing(mockProperty, LocalDate.now().plusDays(180), LocalDate.now().plusDays(190), rightNow, rightNow, 2500.0);
		assertTrue(listing2.isPlannedPromotion());
	}

	@Test
	void testLastMinutePromotion() {
		Listing listing2;
		
		assertTrue(!listing1.isLastMinutePromotion());
		
		listing2 = new Listing(mockProperty, LocalDate.now().plusDays(7), LocalDate.now().plusDays(30), rightNow, rightNow, 2500.0);
		assertTrue(listing2.isLastMinutePromotion());

		listing2 = new Listing(mockProperty, LocalDate.now().plusDays(7), LocalDate.now().plusDays(20), rightNow, rightNow, 2500.0);
		assertTrue(listing2.isLastMinutePromotion());

		listing2 = new Listing(mockProperty, LocalDate.now().plusDays(7), LocalDate.now().plusDays(40), rightNow, rightNow, 2500.0);
		assertTrue(!listing2.isLastMinutePromotion());
	}
}
