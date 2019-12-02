package features;

import java.util.ArrayList;
import java.util.List;

import bookings.Listing;

public class OrCompoundFilter implements IListingFilter {

	private List<IListingFilter> simpleFilters = new ArrayList<>();

	public void addFilter(IListingFilter aFilter) {
		simpleFilters.add(aFilter);
    }
 
    public void removeFilter(IListingFilter aFilter) {
    	simpleFilters.remove(aFilter);
    }

	@Override
	public Boolean match(Listing aListing, SearchCriteria aCriteria) {
		return simpleFilters.stream().anyMatch(filter -> filter.match(aListing, aCriteria));
	}

}
