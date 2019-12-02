package features;

import bookings.Listing;

public class CapacityFilter implements IListingFilter {

	@Override
	public Boolean match(Listing aListing, SearchCriteria aCriteria) {
		return (aCriteria.getCapacity() == null) || aListing.getProperty().getCapacity() >= aCriteria.getCapacity();
	}

}
