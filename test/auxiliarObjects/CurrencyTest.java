package auxiliarObjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CurrencyTest  {
	@Test
	void testReflexiveCurrency() {
		/* Reflexivo */
		Currency aCurrency = new Currency("Peso");
		assertTrue(aCurrency.equals(aCurrency));
		assertEquals(aCurrency, aCurrency);
	}
	
	@Test
	void testSymmetricCurrency() {
		/* Simétrico */
		Currency aCurrency = new Currency("Peso");
		Currency anotherCurrency = new Currency("Peso");
		assertEquals(aCurrency, anotherCurrency);
		assertTrue(aCurrency.equals(anotherCurrency));
		assertTrue(anotherCurrency.equals(aCurrency));
	}

	@Test
	void testNotNullCurrency() {
		Currency aCurrency = new Currency("Peso");
		assertFalse(aCurrency.equals(null));
	}

	@Test
	void testDifferentCurrency() {
		Currency aCurrency = new Currency("Peso");
		Currency anotherCurrency = new Currency("Euro");
		assertFalse(aCurrency.equals(anotherCurrency));
	}
}
