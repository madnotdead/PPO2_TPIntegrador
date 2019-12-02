package rankings;

import java.time.LocalDate;

import bookings.User;
import properties.Property;

public class TenantToPropertyReview extends Review {
	private Property property;

	public TenantToPropertyReview(LocalDate date, User author, ReviewCategory category, Property property) {
		super(date, author, category);
		this.property = property;
	}

	public Property getProperty() {
		return property;
	}
	
}
