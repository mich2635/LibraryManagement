package com.librarymanagement;

import org.junit.Test;

public class ViewBookByName {

	/**
	 * ENTERING CORRECT VALUE
	 */
	@Test
	public void correctDetails() {
		int count = CoreOperation.displayByName("JAVA");
		System.out.println("ASKED BOOK COUNT IS:" + count);

	}

	/**
	 * ENTERING WRONG BOOKS
	 */
	@Test
	public void incorrectDetails() {
		int count = CoreOperation.displayByName("WRONG BOOK");
		System.out.println("ASKED BOOK COUNT IS:" + count);
	}

}
