package features;

import bookings.Listing;

public interface IListingFilter {
	public Boolean match(Listing aListing, SearchCriteria aCriteria);
}
