package features;

import bookings.Listing;

public class ToDateFilter implements IListingFilter {

	@Override
	public Boolean match(Listing aListing, SearchCriteria aCriteria) {
		return (aCriteria.getTo() == null) || aListing.getAvailableTo().compareTo(aCriteria.getTo()) >= 0;
	}

}
