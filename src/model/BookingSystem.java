package model;

import java.util.ArrayList;
import java.util.List;

import auxiliarObjects.*;
import rankings.RankingSubsystem;

public class BookingSystem {
	private static BookingSystem uniqueInstance;

	private List<User> users = new ArrayList<User>();

	private List<Service> services = new ArrayList<Service>();
	private List<PropertyKind> propertiesKinds = new ArrayList<PropertyKind>();
	private List<Country> countries = new ArrayList<Country>();
	private List<City> cities = new ArrayList<City>();

	private List<Property> properties = new ArrayList<Property>();
	private List<Listing> listings = new ArrayList<Listing>();
	private List<Booking> bookings = new ArrayList<Booking>();

	private RankingSubsystem rankingSubsystem = RankingSubsystem.getInstance();

	private BookingSystem() {}

	public static synchronized BookingSystem getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new BookingSystem();
        }
        return uniqueInstance;
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

}
