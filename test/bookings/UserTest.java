/**
 * 
 */
package bookings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

import bookings.User;

/**
 * @author leandrom
 *
 */
public class UserTest {
	
	private User user;
	@Before
	public void setUp() throws Exception {
		user = new User("Juan Perez", "juan@mail.com", "+540119292");
	}


	@Test
	public void getNameTest() {
		assertEquals("Juan Perez", user.getFullName());
	}
	@Test
	public void getMailTest() {
		assertEquals("juan@mail.com", user.getEmail());
	}
	@Test
	public void getPhoneTest() {
		assertEquals("+540119292", user.getPhoneNumber());
	}
	

}
