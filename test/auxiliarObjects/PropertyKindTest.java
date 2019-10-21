package auxiliarObjects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PropertyKindTest {
	PropertyKind type1;
	@BeforeEach
	void setUp() {
		type1 = new PropertyKind("Hotel");
	}
	@Test
	void testGetType() {
		assertEquals(type1.getType(), "Hotel");
	}

}
