package com.librarymanagement;
import org.junit.Test;
public class BookRetrievingTest {
	
	/**
	 * ENTERING CORRECT BOOK NUMBER
	 */
	@Test
	public void correctBookNumber() {
		int bookno=1;
		int quantity=2;
		long id=963217104019L;
		CoreOperation.retrieveBook(bookno,quantity,id);
		//viewing the stocks to reference
		CoreOperation.stocks();
	}

	/**
	 * ENTERING WRONG BOOK NUMBERS
	 */
	@Test
	public void incorrectBookNumber()
	{
		int bookno=9;
		int quantity=2;
		long id=963217104019L;
		CoreOperation.retrieveBook(bookno,quantity,id);
		
	}
	
	/**
	 * ENTERING CORRECT BOOK NUMBER BUT INCORRECT QUANTITY
	 */
		@Test
		public void incorrectQuantity() {
			int bookno=1;
			int quantity=4;
			long id=963217104019L;
			CoreOperation.retrieveBook(bookno,quantity,id);
			//viewing the stocks to reference
			CoreOperation.stocks();
		}

}
