package com.librarymanagement;

import org.junit.Test;

public class BookChooserTest {

	/**
	 * Enter correct book number
	 */
	@Test
	public void takeBookCorrectDetails() {
		int bookno = 1;
		int quantity = 2;
		long id = 963217104019L;
		TakeBook.allBooks(bookno, quantity, id);
		// Performing display debt users for our reference
		CoreOperation.displayDebtUsers();
	}

	/**
	 * Enter incorrect book number
	 */
	@Test
	public void takeBookIncorrectDetails() {
		int bookno = 8;
		int quantity = 1;
		long id = 963217104019L;
		TakeBook.allBooks(bookno, quantity, id);
		// Performing display debt users for our reference
		CoreOperation.displayDebtUsers();
	}

	/**
	 * Enter correct book number wrong quantity
	 */
	@Test
	public void takeBookInCorrectQuantity() {
		int bookno = 4;
		int quantity = 4;
		long id = 963217104019L;
		TakeBook.allBooks(bookno, quantity, id);
		// Performing display debt users for our reference
		CoreOperation.displayDebtUsers();
	}
}
