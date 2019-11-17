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
	
	/**
	 * @param type
	 * @param address
	 * @param services
	 * @param capacity
	 * @param owner
	 */
	public Property(PropertyKind type, Address address, List<Service> services, Integer capacity, User owner) {
		super();
		this.type = type;
		this.address = address;
		this.services = services;
		this.capacity = capacity;
		this.owner = owner;
	}
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
	public Integer getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	/**
	 * @return the userId
	 */
	public User getOwner() {
		return owner;
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
