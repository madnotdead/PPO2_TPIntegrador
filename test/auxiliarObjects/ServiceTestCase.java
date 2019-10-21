package auxiliarObjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServiceTestCase {
	Service service1;
	@BeforeEach
	void setUp(){
		service1 = new Service("WiFi");
	}

	@Test
	void testGetService() {
		assertEquals(service1.getService(), "WiFi");
	}

}
