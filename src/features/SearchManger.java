package features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Listing;
import model.SearchCriteria;

public class SearchManger {

	private List<Listing> listings;
	
	public SearchManger(List<Listing> listings) {
		this.listings = listings;
	}
	
	public List<Listing> doSearch(SearchCriteria searchCriteria) {

		Stream<Listing> listingsStream = this.listings.stream();
		
		if (searchCriteria.getCity() != null) {
			listingsStream = listingsStream
					.filter( p -> p.getProperty().getAddress().getCity().toLowerCase()
							.equals(searchCriteria.getCity().toLowerCase()));
		} 
		
		if (searchCriteria.getCapacity() != null) {
			listingsStream = listingsStream
					.filter( p -> p.getProperty().getCapacity() <= searchCriteria.getCapacity());
		}
		
		if (searchCriteria.getFrom() != null) {
			listingsStream = listingsStream
					.filter( p -> p.getAvailableFRom().compareTo(searchCriteria.getFrom()) == 1);
		}
		
		if (searchCriteria.getMinPrice() != null) {
			listingsStream = listingsStream
					.filter( p -> p.getPrice().getAmount() >= searchCriteria.getMinPrice().getAmount());
		}
		
		if (searchCriteria.getMaxPrice() != null) {
			listingsStream = listingsStream
					.filter( p -> p.getPrice().getAmount() <= searchCriteria.getMaxPrice().getAmount());
		}
		
		if (searchCriteria.getTo() != null) {
			listingsStream = listingsStream
					.filter( p -> p.getAvailableTo().compareTo(searchCriteria.getTo()) == 1);
		}
		
		return listingsStream.collect(Collectors.toList());
	}
}
