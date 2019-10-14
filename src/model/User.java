package model;

/**
 * @author leandrom
 *
 */
public class User {

	private String id = UUID.randomUUID().toString();
	private String email;
	private String fullName;
	private String phoneNumber;

	public User(final String fullName, final String email, final String phoneNumber) {
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
}
