package features;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bookings.Listing;
import properties.City;

public class SearchManger {

	private SearchCriteria searchCriteria;
	private IListingFilter searchFilter;
	
	public SearchManger(City aCity, LocalDate aDate, LocalDate otherDate, Integer capacity, Double aPrice, Double otherPrice) {
		this.searchCriteria = new SearchCriteria(aCity, aDate, otherDate, capacity, aPrice, otherPrice);
		this.searchFilter = this.searchFilter();  
	}
	
	public SearchManger(City aCity, LocalDate aDate, LocalDate otherDate) {
		this(aCity, aDate, otherDate, null, null, null);
	}

	private IListingFilter searchFilter() {
		AndCompoundFilter searchFilter = new AndCompoundFilter();
		searchFilter.addFilter(new CityFilter());
		searchFilter.addFilter(new FromDateFilter());
		searchFilter.addFilter(new ToDateFilter());
		searchFilter.addFilter(new CapacityFilter());
		searchFilter.addFilter(new MinimumPriceFilter());
		searchFilter.addFilter(new MaximumPriceFilter());
		return searchFilter;
	}
	
	public List<Listing> doSearch(List<Listing> listings) {

		Stream<Listing> listingsStream = listings.stream();
		
		listingsStream = listingsStream.filter(listing -> searchFilter.match(listing, searchCriteria));
		
		return listingsStream.collect(Collectors.toList());
	}
}
