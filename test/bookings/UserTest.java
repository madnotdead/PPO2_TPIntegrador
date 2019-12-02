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
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		user = new User("Juan Perez", "juan@mail.com", "+540119292");
	}


	@Test
	public void test() {
		assertEquals("Juan Perez", user.getFullName());
	}

}
