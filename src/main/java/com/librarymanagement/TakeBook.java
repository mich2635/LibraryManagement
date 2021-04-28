package com.librarymanagement;

import java.time.LocalDate;
import java.time.LocalTime;

public class TakeBook {

	/**
	 * This function used to select book and send to Corporation for further
	 * calculation,it also do date related calculations
	 * 
	 * @param bookNumber
	 * @param quantity
	 * @param id
	 */
	public static void allBooks(int bookNumber, int quantity, long id) {

		switch (bookNumber) {
		case 1: // if book number is 1
			LocalDate takenDate = LocalDate.now();
			LocalTime takenTime = LocalTime.now();
			int quantchecker = CoreOperation.takeBook(quantity, 1, id);
			if (quantchecker == 1) {
				System.out.println("BOOK TAKEN TIME:" + takenTime);
				System.out.println("TAKEN BOOK IS SOLID MECHANICS");
				System.out.println("BOOK TAKEN DATE:" + takenDate);
				int retrievingDate = takenDate.getDayOfMonth() + 2;
				System.out.println("BOOK RETRIEVING DATE:" + retrievingDate);
			}
			break;
		case 2: // if book number is 2
			takenDate = LocalDate.now();
			takenTime = LocalTime.now();
			quantchecker = CoreOperation.takeBook(quantity, 2, id);
			if (quantchecker == 1) {
				System.out.println("BOOK TAKEN TIME:" + takenTime);
				System.out.println("TAKEN BOOK IS 	FLUID MECHANICS");
				System.out.println("BOOK TAKEN DATE:" + takenDate);
				int retrievingDate = takenDate.getDayOfMonth() + 2;
				System.out.println("BOOK RETRIEVING DATE:" + retrievingDate);
			}
			break;
		case 3: // if book number is 3
			takenDate = LocalDate.now();
			takenTime = LocalTime.now();
			quantchecker = CoreOperation.takeBook(quantity, 3, id);
			if (quantchecker == 1) {
				System.out.println("BOOK TAKEN TIME:" + takenTime);
				System.out.println("BOOK TAKEN DATE:" + takenDate);
				System.out.println("TAKEN BOOK IS BRICKS");
				int retrievingDate = takenDate.getDayOfMonth() + 2;
				System.out.println("BOOK RETRIEVING DATE:" + retrievingDate);
			}

			break;
		case 4: // if book number is 4
			takenDate = LocalDate.now();
			takenTime = LocalTime.now();
			quantchecker = CoreOperation.takeBook(quantity, 4, id);
			if (quantchecker == 1) {
				System.out.println("BOOK TAKEN TIME:" + takenTime);
				System.out.println("BOOK TAKEN DATE:" + takenDate);
				System.out.println("TAKEN BOOK IS SURVEY");
				int retrievingDate = takenDate.getDayOfMonth() + 2;
				System.out.println("BOOK RETRIEVING DATE:" + retrievingDate);
			}
			break;
		case 5: // if book number is 5
			takenDate = LocalDate.now();
			takenTime = LocalTime.now();
			quantchecker = CoreOperation.takeBook(quantity, 6, id);
			if (quantchecker == 1) {
				System.out.println("BOOK TAKEN TIME:" + takenTime);
				System.out.println("BOOK TAKEN DATE:" + takenDate);
				System.out.println("TAKEN BOOK IS DBMS");
				int retrievingDate = takenDate.getDayOfMonth() + 2;
				System.out.println("BOOK RETRIEVING DATE:" + retrievingDate);
			}

			break;
		case 6: // if book number is 6
			takenDate = LocalDate.now();
			takenTime = LocalTime.now();
			quantchecker = CoreOperation.takeBook(quantity, 6, id);
			if (quantchecker == 1) {
				System.out.println("BOOK TAKEN TIME:" + takenTime);
				System.out.println("BOOK TAKEN DATE:" + takenDate);
				System.out.println("TAKEN BOOK IS JAVA");
				int retrievingDate = takenDate.getDayOfMonth() + 2;
				System.out.println("BOOK RETRIEVING DATE:" + retrievingDate);
			}
			break;
		default:
			System.out.println("ENTER THE DETAILS CORRECTLY"); // if wrong book number
			break;
		}
	}
}
