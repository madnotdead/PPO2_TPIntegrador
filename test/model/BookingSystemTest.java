package model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import auxiliarObjects.PropertyKind;
import auxiliarObjects.Service;

class BookingSystemTest {

	BookingSystem bookingSystem = BookingSystem.getInstance();
	PropertyKind kind = mock(PropertyKind.class);
	Service service = mock(Service.class);

	@Test
	void testAddingPropertyKind() {
		bookingSystem.addPropertyKind(kind);
		assertTrue(bookingSystem.getPropertiesKinds().contains(kind));
	}

	@Test
	void testAddingPropertyService() {
		bookingSystem.addService(service);
		assertTrue(bookingSystem.getServices().contains(service));
	}

	
}
