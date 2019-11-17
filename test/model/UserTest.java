/**
 * 
 */
package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import model.User;

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

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		assertEquals("Juan Perez", user.getFullName());
	}

}
