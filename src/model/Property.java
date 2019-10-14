package model;

import java.util.List;

import auxiliarObjects.PropertyKind;
import auxiliarObjects.Service;
import model.Address;

public class Property {

	private PropertyKind type;
	private Address address;
	private List<Service> services;
	private int capacity;
	private User owner;
	
	/**
	 * @return the type
	 */
	public PropertyKind getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(PropertyKind type) {
		this.type = type;
	}
	/**
	 * @return the services
	 */
	public List<Service> getServices() {
		return services;
	}
	/**
	 * @param services the services to set
	 */
	public void setServices(List<Service> services) {
		this.services = services;
	}
	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	/**
	 * @return the userId
	 */
	public User geOwner() {
		return owner;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setOwner(User anOwner) {
		this.owner = anOwner;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

}
