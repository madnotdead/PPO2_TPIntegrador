package bookings;

import java.time.LocalDate;
import java.util.UUID;

/**
 * @author leandrom
 *
 */
public class User {

	private String id = UUID.randomUUID().toString();
	private String email;
	private String fullName;
	private String phoneNumber;
	private LocalDate registrationDate;

	public User(final String fullName, final String email, final String phoneNumber) {
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.registrationDate = LocalDate.now();
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

}
