package model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListingTest {
	Listing listing1;
	Property mockProperty;
	LocalTime rightNow;
	LocalDate today;
	
	@BeforeEach
	void setUp() {
		mockProperty = mock(Property.class);
		rightNow = LocalTime.now();
		today = LocalDate.now();
		listing1 = new Listing(mockProperty,today, today, rightNow, rightNow, 2500.0);
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
}
