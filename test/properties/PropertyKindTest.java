package properties;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import properties.PropertyKind;

class PropertyKindTest {
	@Test
	void testReflexivePropertyKind() {
		/* Reflexivo */
		PropertyKind aPropertyKind = new PropertyKind("Choza");
		assertTrue(aPropertyKind.equals(aPropertyKind));
		assertEquals(aPropertyKind, aPropertyKind);
		assertEquals(aPropertyKind.hashCode(),aPropertyKind.hashCode());
	}
	
	@Test
	void testSymmetricPropertyKind() {
		/* Simétrico */
		PropertyKind aPropertyKind = new PropertyKind("Choza");
		PropertyKind anotherPropertyKind = new PropertyKind("Choza");
		assertEquals(aPropertyKind, anotherPropertyKind);
		assertTrue(aPropertyKind.equals(anotherPropertyKind));
		assertTrue(anotherPropertyKind.equals(aPropertyKind));
	}

	@Test
	void testNotNullPropertyKind() {
		PropertyKind aPropertyKind = new PropertyKind("Choza");
		assertFalse(aPropertyKind.equals(null));
	}


	@Test
	void testDifferentPropertyKind() {
		PropertyKind aPropertyKind = new PropertyKind("Choza");
		PropertyKind anotherPropertyKind = new PropertyKind("Carpa");
		assertFalse(aPropertyKind.equals(anotherPropertyKind));
	}
}
