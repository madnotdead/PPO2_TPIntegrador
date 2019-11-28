package model;

import java.util.List;

import auxiliarObjects.Address;
import auxiliarObjects.PropertyKind;
import auxiliarObjects.Service;

public class Property {

	private PropertyKind type;
	private Address address;
	private List<Service> services;
	private Integer capacity;
	private User owner;
	
	public Property(PropertyKind type, Address address, List<Service> services, Integer capacity, User owner) {
		super();
		this.type = type;
		this.address = address;
		this.services = services;
		this.capacity = capacity;
		this.owner = owner;
	}

	public PropertyKind getType() {
		return type;
	}

	public List<Service> getServices() {
		return services;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public User getOwner() {
		return owner;
	}

	public Address getAddress() {
		return address;
	}

}
