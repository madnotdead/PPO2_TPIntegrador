package properties;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import properties.Country;

class CountryTest {

	@Test
	void testReflexiveCountry() {
		/* Reflexivo */
		Country aCountry = new Country("Japón");
		assertTrue(aCountry.equals(aCountry));
		assertEquals(aCountry, aCountry);
		assertEquals(aCountry.hashCode(),aCountry.hashCode());
	}
	
	@Test
	void testSymmetricCountry() {
		/* Simétrico */
		Country aCountry = new Country("Japón");
		Country anotherCountry = new Country("Japón");
		assertEquals(aCountry, anotherCountry);
		assertTrue(aCountry.equals(anotherCountry));
		assertTrue(anotherCountry.equals(aCountry));
	}
	
	@Test
	void testTransitiveCountry() {
		/* Transitivo */
		Country aCountry = new Country("Japón");
		Country otherCountry = new Country("Japón");
		Country anotherCountry = new Country("Japón");
		assertTrue(aCountry.equals(otherCountry));
		assertTrue(otherCountry.equals(anotherCountry));
		assertTrue(aCountry.equals(anotherCountry));
	}

	@Test
	void testNotNullCountry() {
		Country aCountry = new Country("Japón");
		assertFalse(aCountry.equals(null));
	}

	@Test
	void testDifferentCountry() {
		Country aCountry = new Country("Japón");
		Country anotherCountry = new Country("China");
		assertFalse(aCountry.equals(anotherCountry));
	}
}
