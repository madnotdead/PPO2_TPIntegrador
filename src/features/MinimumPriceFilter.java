package features;

import bookings.Listing;

public class MinimumPriceFilter implements IListingFilter {
	
	@Override
	public Boolean match(Listing aListing, SearchCriteria aCriteria) {
		return (aCriteria.getMinPrice() == null) || aListing.getPrice() >= aCriteria.getMinPrice();
	}

}
