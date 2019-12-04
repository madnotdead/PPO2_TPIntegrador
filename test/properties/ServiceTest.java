package properties;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import properties.Service;

class ServiceTest {
	@Test
	void testReflexiveService() {
		/* Reflexivo */
		Service aService = new Service("Agua caliente");
		assertTrue(aService.equals(aService));
		assertEquals(aService, aService);
		assertEquals(aService.hashCode(),aService.hashCode());
	}
	
	@Test
	void testSymmetricService() {
		/* Simétrico */
		Service aService = new Service("Agua caliente");
		Service anotherService = new Service("Agua caliente");
		assertEquals(aService, anotherService);
		assertTrue(aService.equals(anotherService));
		assertTrue(anotherService.equals(aService));
	}

	@Test
	void testNotNullService() {
		Service aService = new Service("Agua caliente");
		assertFalse(aService.equals(null));
	}

	@Test
	void testDifferentService() {
		Service aService = new Service("Agua caliente");
		Service anotherService = new Service("WiFi");
		assertFalse(aService.equals(anotherService));
	}
}
