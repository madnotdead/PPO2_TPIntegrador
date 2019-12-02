package features;

import bookings.Listing;

public class CityFilter implements IListingFilter {

	@Override
	public Boolean match(Listing aListing, SearchCriteria aCriteria) {
		return aListing.getCity().equals(aCriteria.getCity());
	}

}
