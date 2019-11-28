package rankings;

import java.time.LocalDate;

import model.User;

public class Review {
	private LocalDate date;
	private User author;
	private ReviewCategory category;

	public Review(LocalDate date, User author, ReviewCategory category) {
		this.date = date;
		this.author = author;
		this.category = category;
	}
	public LocalDate getDate() {
		return date;
	}
	public User getAuthor() {
		return author;
	}
	public ReviewCategory getCategory() {
		return category;
	}
}
