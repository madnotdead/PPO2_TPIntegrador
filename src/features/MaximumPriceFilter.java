package features;

import bookings.Listing;

public class MaximumPriceFilter implements IListingFilter {

	@Override
	public Boolean match(Listing aListing, SearchCriteria aCriteria) {
		return (aCriteria.getMaxPrice() == null) || aListing.getPrice() <= aCriteria.getMaxPrice();
	}

}
