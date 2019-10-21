package auxiliarObjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PriceTestCase {
	Currency ars;
	Price price1;

	@BeforeEach
	void setUp(){
		ars = new Currency("Pesos");
		price1 = new Price(ars, 3000.50);
	}

	@Test
	void testGetCurrency() {
		assertEquals(price1.getCurrency(), ars);
	}

	@Test
	void testGetAmount() {
		assertEquals(price1.getAmount(), 3000.50);
	}

}
