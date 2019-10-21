package auxiliarObjects;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CurrencyTestCaseTest  {
	Currency currency1;
	@BeforeEach
	void setUp(){
		currency1 = new Currency("Pesos");
	}

	@Test
	void testGetCurrency() {
		assertEquals(currency1.getCurrency(), "Pesos");
	}

}
