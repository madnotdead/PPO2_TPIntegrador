import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import auxiliarObjects.PropertyKind;
import auxiliarObjects.Service;
import model.Address;
import model.User;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

class PropertyTestCase {
	PropertyKind kindMock = mock(PropertyKind.class);
	Address addressMock = mock(Address.class);
	User userMock = mock(User.class);
	List<Service> services = new ArrayList<Service>();
	model.Property property1 = new model.Property( kindMock , addressMock, services , 4, userMock);
	
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
