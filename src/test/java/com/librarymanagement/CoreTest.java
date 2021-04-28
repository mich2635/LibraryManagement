package com.librarymanagement;

import org.junit.Test;

public class CoreTest {
	/**
	 * testing the dynamic changing of all
	 * storage
	 */
	@Test
	public void overallTest() {
		
		//user 1
		//Taking book
		
		int bookno=1;
		int quantity=2;
		long id=963217104019L;
		System.out.println("---------------");
		TakeBook.allBooks(bookno, quantity,id);
		
		//user 2 for our reference
		//Taking book
		
		bookno=2;
		quantity=2;
		id=963217104020L;
		System.out.println("---------------");
		TakeBook.allBooks(bookno, quantity,id);
		
		//user 3 take book with insufficient quantity
		
		bookno=2;
		quantity=2;
		id=963217104021L;
		System.out.println("---------------");
		TakeBook.allBooks(bookno, quantity,id);
		
		//displaying remaining stocks and debt users
		
		System.out.println("----------------");
		CoreOperation.stocks();
		CoreOperation.displayDebtUsers();
		
		//searching for book availability
		
		System.out.println("---------------");
		int count=CoreOperation.byName("SOLID MECHANICS");
		System.out.println("ASKED BOOK COUNT IS:"+count);
		
		//user 1 retrieving book and checking for debts
		
		bookno=1;
		quantity=2;
		id=963217104019L;
		System.out.println("---------------");
		CoreOperation.retrieveBook(bookno,quantity,id);
		CoreOperation.stocks();
		CoreOperation.displayDebtUsers();
	}

}
