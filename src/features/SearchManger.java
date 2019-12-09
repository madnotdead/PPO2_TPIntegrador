package features;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bookings.Listing;
import properties.City;

public class SearchManger {

	private SearchCriteria searchCriteria;
	
	public SearchManger(City aCity, LocalDate aDate, LocalDate otherDate, Integer capacity, Double aPrice, Double otherPrice) {
		this.searchCriteria = new SearchCriteria(aCity, aDate, otherDate, capacity, aPrice, otherPrice);
	}
	
	public SearchManger(City aCity, LocalDate aDate, LocalDate otherDate) {
		this(aCity, aDate, otherDate, null, null, null);
	}
	
	public List<Listing> search(IListingFilter searchFilter, List<Listing> listings) {

		Stream<Listing> listingsStream = listings.stream();
		
		listingsStream = listingsStream.filter(listing -> listing.isActive() && searchFilter.match(listing, searchCriteria));

		return listingsStream.collect(Collectors.toList());
	}
}
