package rankings;

import java.time.LocalDate;

import bookings.User;

public class OwnerToTenantReview extends Review {
	private User tenant;
	public OwnerToTenantReview(LocalDate date, User author, ReviewCategory category, User tenant) {
		super(date, author, category);
		this.tenant = tenant;
	}
	public User getTenant() {
		return tenant;
	}

}
