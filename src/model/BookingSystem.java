package model;

import java.util.ArrayList;
import java.util.List;

import auxiliarObjects.*;

public class BookingSystem {
	private static BookingSystem uniqueInstance;

	private List<User> users = new ArrayList<User>();

	private List<Service> services = new ArrayList<Service>();
	private List<PropertyKind> propertiesKinds = new ArrayList<PropertyKind>();
	private List<Country> countries = new ArrayList<Country>();
	private List<City> cities = new ArrayList<City>();
	private List<Currency> currencies = new ArrayList<Currency>();
	private List<ReviewCategory> reviewCategories = new ArrayList<ReviewCategory>(); 

	private List<Property> properties = new ArrayList<Property>();
	private List<Listing> listings = new ArrayList<Listing>();
	private List<Booking> bookings = new ArrayList<Booking>();
	private List<TenantToPropertyReview> tenantToPropertyReviews = new ArrayList<TenantToPropertyReview>();
	private List<TenantToOwnerReview> tenantToOwnerReviews = new ArrayList<TenantToOwnerReview>();
	private List<OwnerToTenantReview> ownerToTenantReviews = new ArrayList<OwnerToTenantReview>();

	private BookingSystem() {}

	public static synchronized BookingSystem getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new BookingSystem();
        }
        return uniqueInstance;
    }
}
