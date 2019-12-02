package properties;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import properties.City;
import properties.Country;

class CityTest {

	@Test
	void testReflexiveCity() {
		/* Reflexivo */
		City aCity = new City("Sydney", new Country("Australia"));
		assertTrue(aCity.equals(aCity));
		assertEquals(aCity, aCity);
	}
	
	@Test
	void testSymmetricCity() {
		/* Simétrico */
		City aCity = new City("Sydney", new Country("Australia"));
		City anotherCity = new City("Sydney", new Country("Australia"));
		assertEquals(aCity, anotherCity);
		assertTrue(aCity.equals(anotherCity));
		assertTrue(anotherCity.equals(aCity));
	}
	
	@Test
	void testNotNullCity() {
		City aCity = new City("Sydney", new Country("Australia"));
		assertFalse(aCity.equals(null));
	}

	@Test
	void testDifferentCity() {
		City aCity = new City("Sydney", new Country("Australia"));
		City otherCity = new City("Sydney", new Country("Tailandia"));
		City anotherCity = new City("Moscú", new Country("Rusia"));
		assertFalse(aCity.equals(anotherCity));
		assertFalse(aCity.equals(otherCity));
		assertFalse(otherCity.equals(anotherCity));
	}
}
