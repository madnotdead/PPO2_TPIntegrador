package auxiliarObjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PriceTestCase {
	Price price1;
	@BeforeEach
	void setUp(){
		price1 = new Price("Pesos", 3000);
	}

	@Test
	void testGetCurrency() {
		assertEquals(price1.getCurrency(), "Pesos");
	}

	@Test
	void testGetAmount() {
		assertEquals(price1.getAmount(), 3000);
	}

}
