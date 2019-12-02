package properties;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import bookings.User;

public class PropertiesSubsystem {
	private static PropertiesSubsystem uniqueInstance;

	private List<PropertyKind> propertiesKinds = new ArrayList<PropertyKind>();
	private List<Service> services = new ArrayList<Service>();
	private List<Country> countries = new ArrayList<Country>();
	private List<City> cities = new ArrayList<City>();
	private List<Property> properties = new ArrayList<Property>();

	private PropertiesSubsystem() {}

	public static synchronized PropertiesSubsystem getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new PropertiesSubsystem();
        }
        return uniqueInstance;
    }
	public static synchronized void reset() {
		uniqueInstance = null;
	}

	public void addPropertyKind(PropertyKind aKind) {
		this.propertiesKinds.add(aKind);
	}
	public List<PropertyKind> getPropertiesKinds() {
		return propertiesKinds;
	}

	public void addService(Service aService) {
		this.services.add(aService);
	}
	public List<Service> getServices() {
		return services;
	}
	
	public void addCountry(Country aCountry) {
		this.countries.add(aCountry);
	}
	public List<Country> getCountries() {
		return countries;
	}

	public void addCity(City aCity) {
		this.cities.add(aCity);
	}
	public List<City> getCities() {
		return cities;
	}

	public void addProperty(Property aProperty) {
		this.properties.add(aProperty);
	}
	public List<Property> getProperties() {
		return properties;
	}

	public List<Property> getPropertiesForOwner(User owner) {
		return this.properties.stream().filter( p -> p.getOwner().equals(owner)).collect(Collectors.toList());
	}
}
