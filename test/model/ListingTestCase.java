package model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import auxiliarObjects.Price;

class ListingTestCase {
	Listing listing1;
	Property mockProperty;
	Price mockPrice;
	
	
	@BeforeEach
	void setUp() {
		mockProperty = mock(Property.class);
		mockPrice = mock(Price.class);
		listing1 = new Listing(mockProperty, LocalTime.now(), mockPrice, LocalDate.of(2019, 12, 1), LocalDate.of(2019, 12, 20));
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
		assertEquals(listing1.getPrice(), mockPrice);
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
