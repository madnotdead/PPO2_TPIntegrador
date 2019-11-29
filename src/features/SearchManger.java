package features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Listing;

public class SearchManger {

	private List<Listing> listings;
	
	public SearchManger(List<Listing> listings) {
		this.listings = listings;
	}
	
	public List<Listing> doSearch(SearchCriteria searchCriteria) {

		Stream<Listing> listingsStream = this.listings.stream();
		
		if (searchCriteria.getCity() != null) {
			listingsStream = listingsStream
					.filter( p -> p.getProperty().getAddress().getCity().equals(searchCriteria.getCity()));
		} 
		
		if (searchCriteria.getCapacity() != null) {
			listingsStream = listingsStream
					.filter( p -> p.getProperty().getCapacity() <= searchCriteria.getCapacity());
		}
		
		if (searchCriteria.getFrom() != null) {
			listingsStream = listingsStream
					.filter( p -> p.getAvailableFrom().compareTo(searchCriteria.getFrom()) == 1);
		}
		
		if (searchCriteria.getMinPrice() != null) {
			listingsStream = listingsStream
					.filter( p -> p.getPrice() >= searchCriteria.getMinPrice());
		}
		
		if (searchCriteria.getMaxPrice() != null) {
			listingsStream = listingsStream
					.filter( p -> p.getPrice() <= searchCriteria.getMaxPrice());
		}
		
		if (searchCriteria.getTo() != null) {
			listingsStream = listingsStream
					.filter( p -> p.getAvailableTo().compareTo(searchCriteria.getTo()) == 1);
		}
		
		return listingsStream.collect(Collectors.toList());
	}
}
