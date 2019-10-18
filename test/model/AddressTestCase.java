package model;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.Address;

class AddressTestCase {

	Address address1 = new Address("Argentina", "Quilmes", "Roque Saenz Peña", 352);

	@Test
	void testGetCountry() {
		assertEquals(address1.getCountry(), "Argentina");
	}

	@Test
	void testGetCity() {
		assertEquals(address1.getCity(), "Quilmes");
	}

	@Test
	void testGetStreet() {
		assertEquals(address1.getStreet(), "Roque Saenz Peña");
	}

	@Test
	void testGetNumber() {
		assertEquals(address1.getNumber(),352);;
	}
}
