package properties;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import bookings.User;
import properties.Address;
import properties.PropertyKind;
import properties.Service;

import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

class PropertyTest {
	PropertyKind kindMock = mock(PropertyKind.class);
	Address addressMock = mock(Address.class);
	User userMock = mock(User.class);
	List<Service> services = new ArrayList<Service>();
	properties.Property property1 = new properties.Property( kindMock , addressMock, services , 4, userMock);
	
	@Test
	void testGetType() {
		assertEquals(property1.getType(), kindMock);
	}

	@Test
	void testGetServices() {
		assertEquals(property1.getServices(), services);
	}

	@Test
	void testGetCapacity() {
		assertEquals(property1.getCapacity(), 4);
	}

	@Test
	void testGetOwner() {
		assertEquals(property1.getOwner(), userMock);
	}

	@Test
	void testGetAddress() {
		assertEquals(property1.getAddress(), addressMock);
	}

}
