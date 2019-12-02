package features;

import java.time.LocalDate;

import properties.City;

public class SearchCriteria {

	private City city;
	private LocalDate fromDate;
	private LocalDate toDate;
	private Integer capacity;
	private Double minPrice;
	private Double maxPrice;
	
	public SearchCriteria(City aCity, LocalDate aDate, LocalDate otherDate, Integer capacity, Double aPrice, Double otherPrice) {
		this.city = aCity;
		this.fromDate = aDate;
		this.toDate = otherDate;
		this.capacity = capacity;
		this.minPrice = aPrice;
		this.maxPrice = otherPrice;
	}
	
	public City getCity() {
		return city;
	}
	public Double getMinPrice() {
		return minPrice;
	}
	public Double getMaxPrice() {
		return maxPrice;
	}
	public LocalDate getFrom() {
		return fromDate;
	}
	public LocalDate getTo() {
		return toDate;
	}
	public Integer getCapacity() {
		return capacity;
	}
}
