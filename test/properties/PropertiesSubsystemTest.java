package properties;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import bookings.User;

class PropertiesSubsystemTest {

	public PropertiesSubsystem propertiesSystem = PropertiesSubsystem.getInstance();

	@Test
	void testUniqueInstance() {
		PropertiesSubsystem otherPropertiesSystem = PropertiesSubsystem.getInstance();
		
		assertEquals(propertiesSystem, otherPropertiesSystem);
	}

	@Test
	void testResetInstance() {
		PropertiesSubsystem.reset();
		PropertiesSubsystem otherPropertiesSystem = PropertiesSubsystem.getInstance();

		assertNotEquals(propertiesSystem, otherPropertiesSystem);
	}

	@Test
	void testAddingPropertyKind() {
		PropertyKind kind = mock(PropertyKind.class);
		
		propertiesSystem.addPropertyKind(kind);
		assertTrue(propertiesSystem.getPropertiesKinds().contains(kind));
	}

	@Test
	void testAddingPropertyService() {
		Service service = mock(Service.class);

		propertiesSystem.addService(service);
		assertTrue(propertiesSystem.getServices().contains(service));
	}

	@Test
	void testAddingCity() {
		City city = mock(City.class);

		propertiesSystem.addCity(city);
		assertTrue(propertiesSystem.getCities().contains(city));
	}

	@Test
	void testAddingCountry() {
		Country country = mock(Country.class);

		propertiesSystem.addCountry(country);
		assertTrue(propertiesSystem.getCountries().contains(country));
	}

	@Test
	void testAddingProperty() {
		Property property = mock(Property.class);

		propertiesSystem.addProperty(property);
		assertTrue(propertiesSystem.getProperties().contains(property));
	}
	
	@Test
	void testGettingPropertiesForAnOwner() {
		User owner = mock(User.class);
		Property property = mock(Property.class);
		when(property.getOwner()).thenReturn(owner);
		
		propertiesSystem.addProperty(property);
		
		assertTrue(propertiesSystem.getPropertiesForOwner(owner).contains(property));
	}

	@Test
	void testGettingPropertiesForOwnerWithoutProperties() {
		User owner = mock(User.class);
		Property property = mock(Property.class);
		when(property.getOwner()).thenReturn(owner);
		
		User poorOwner = mock(User.class);
		
		assertTrue(propertiesSystem.getPropertiesForOwner(poorOwner).isEmpty());

		propertiesSystem.addProperty(property);
		assertTrue(propertiesSystem.getPropertiesForOwner(poorOwner).isEmpty());
	}
}
