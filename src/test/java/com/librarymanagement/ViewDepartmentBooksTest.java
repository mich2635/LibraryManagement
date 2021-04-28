package com.librarymanagement;

import org.junit.Test;

public class ViewDepartmentBooksTest {

	/**
	 * viewing mech dept books
	 */
	@Test
	public void viewBooks() {
		int deptNumber = 1;
		ViewBooks.books(deptNumber);
	}

	/**
	 * entering incorrect dept number
	 */
	@Test
	public void incorrectBooks() {
		int deptNumber = 4;
		ViewBooks.books(deptNumber);
	}

}
