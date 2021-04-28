package com.librarymanagement;

import static org.junit.Assert.*;

import org.junit.Test;

public class registration {

	@Test
	public void register() {
		// User 1
		long userId = 963217104019L;
		long password = 1234;
		boolean verification = LoginAndRegistration.registration(userId, password);
		assertTrue(verification);
		// User 2
		long userId2 = 963217104019L;
		long password2 = 12345;
		verification = LoginAndRegistration.registration(userId2, password2);
		assertTrue(verification);
		LoginAndRegistration.displayRegisters(); // Testing weather it is added
	}

}
