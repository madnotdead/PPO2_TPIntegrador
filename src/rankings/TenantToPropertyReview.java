package rankings;

import java.time.LocalDate;

import model.Property;
import model.User;

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
