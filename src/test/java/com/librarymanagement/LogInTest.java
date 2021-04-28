package com.librarymanagement;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogInTest {
	
	/**
	 * Registration id and login id match
	 */
	@Test
	public void testWithCorrectDetails() {
		long userId=963217104019L;
		long password=1234;
		//performing registration to test login
		boolean confirmation=LoginAndRegistration.registration(userId,password);
		assertTrue(confirmation);
		boolean authorization=LoginAndRegistration.login(userId,password);
		assertTrue(authorization);
		
	}
	
	/**
	 * Registration id and login  id mismatch
	 */
	@Test
	public void testWithIncorrectDetails()
	{
		long userId=963217104019L;
		long password=1234;
		long wrongPassword=12345;
		//performing registration to test login 
		boolean confirmation=LoginAndRegistration.registration(userId,password);
		assertTrue(confirmation);
		boolean authorization=LoginAndRegistration.login(userId,wrongPassword);
		assertTrue(authorization);
	}

}
