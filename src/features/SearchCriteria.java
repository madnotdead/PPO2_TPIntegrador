package features;

import java.time.LocalDate;

public class SearchCriteria {

	private String city;
	private LocalDate from;
	private LocalDate to;
	private Integer capacity;
	private Double minPrice;
	private Double maxPrice;
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the minPrice
	 */
	public Double getMinPrice() {
		return minPrice;
	}

	/**
	 * @param minPrice the minPrice to set
	 */
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}

	/**
	 * @return the maxPrice
	 */
	public Double getMaxPrice() {
		return maxPrice;
	}

	/**
	 * @param maxPrice the maxPrice to set
	 */
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	/**
	 * @return the from
	 */
	public LocalDate getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(LocalDate from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public LocalDate getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(LocalDate to) {
		this.to = to;
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
}
