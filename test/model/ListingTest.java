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
	
	@BeforeEach
	void setUp() {
		mockProperty = mock(Property.class);
		listing1 = new Listing(mockProperty, LocalTime.now(), 2500.0, LocalDate.of(2019, 12, 1), LocalDate.of(2019, 12, 20));
	}
	@Test
	void testGetProperty() {
		assertEquals(listing1.getProperty(), mockProperty);
	}

	@Test
	void testGetCheckInTime() {
		assertEquals(listing1.getCheckInTime(), LocalTime.now());
	}

	@Test
	void testGetPrice() {
		assertEquals(listing1.getPrice(), 2500.0);
	}

	@Test
	void testGetAvailableFrom() {
		assertEquals(listing1.getAvailableFRom(), LocalDate.of(2019, 12, 1));
	}

	@Test
	void testGetAvailableTo() {
		assertEquals(listing1.getAvailableTo(), LocalDate.of(2019, 12, 20));
	}
}
