package properties;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import properties.Address;
import properties.City;
import properties.Country;

class AddressTest {

	Country aCountry = new Country("Australia");
	City aCity = new City("Sydney", aCountry);
	Address address1 = new Address(aCity, "Roque Saenz Peña", 352);

	@Test
	void testGetCountry() {
		assertEquals(aCountry, address1.getCountry());
	}

	@Test
	void testGetCity() {
		assertEquals(aCity, address1.getCity());
	}

	@Test
	void testGetStreet() {
		assertEquals("Roque Saenz Peña", address1.getStreet());
	}

	@Test
	void testGetNumber() {
		assertEquals(352, address1.getNumber());
	}
}
