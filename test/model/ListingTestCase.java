package model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
		listing1 = new Listing(mockProperty, LocalTime.now(), mockPrice, LocalDate.now(), LocalDate.now());
	}
	@Test
	void testGetProperty() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCheckInTime() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPrice() {
		fail("Not yet implemented");
	}

	@Test
	void testDisable() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAvailableFRom() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAvailableTo() {
		fail("Not yet implemented");
	}

}
