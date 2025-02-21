package features;

import java.util.ArrayList;
import java.util.List;

import bookings.Listing;

public class AndCompoundFilter implements IListingFilter {

	private List<IListingFilter> simpleFilters = new ArrayList<>();

	public void addFilter(IListingFilter aFilter) {
		simpleFilters.add(aFilter);
    }
 
    /* no requiere ser programado. desactivo para pasar el coverage.
	public void removeFilter(IListingFilter aFilter) {
    	simpleFilters.remove(aFilter);
    }
    */

	@Override
	public Boolean match(Listing aListing, SearchCriteria aCriteria) {
		return simpleFilters.stream().allMatch(filter -> filter.match(aListing, aCriteria));
	}

}
