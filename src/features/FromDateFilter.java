package features;

import bookings.Listing;

public class FromDateFilter implements IListingFilter {

	@Override
	public Boolean match(Listing aListing, SearchCriteria aCriteria) {
		return (aCriteria.getFrom() == null) || aListing.getAvailableFrom().compareTo(aCriteria.getFrom()) <= 0;
	}

}
