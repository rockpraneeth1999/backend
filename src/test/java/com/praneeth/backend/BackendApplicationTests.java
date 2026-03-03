package com.praneeth.backend;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BackendApplicationTests {

	@Test
	void testWelcomeMethod() {
		HomeController controller = new HomeController();
		String result = controller.welcome();
		assertEquals("<html><body><h1>Welcome to backend app</h1></body></html>", result);
	}

}
