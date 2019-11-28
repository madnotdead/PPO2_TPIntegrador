package rankings;

import java.time.LocalDate;

import model.User;

public class TenantToOwnerReview extends Review {
	private User owner;

	public TenantToOwnerReview(LocalDate date, User author, ReviewCategory category, User owner) {
		super(date, author, category);
		this.owner = owner;
	}
	public User getOwner() {
		return owner;
	}

}
