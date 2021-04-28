package com.librarymanagement;

import java.util.*;
import java.time.*;

/**
 * This function shows all the available books
 * 
 * @author mich2635
 *
 */
public class CoreOperation {
	// Variable Declaration
	static List<Long> debtUser = new ArrayList<Long>();
	static List<String> dateOfTaken = new ArrayList<String>();
	static int solidMechQuant = 3;
	static int fluidMechQuant = 3;
	static int bricksQuant = 3;
	static int surveyQuant = 3;
	static int dbmsQuant = 3;
	static int javaQuant = 3;

	/**
	 * this method is used to view available number of books
	 */
	public static void displayStocks() {

		System.out.println("AVAILABLE SOLID MECHANICS BOOKS	:" + solidMechQuant);
		System.out.println("AVAILABLE FLUID MECHANICS BOOKS	:" + fluidMechQuant);
		System.out.println("AVAILABLE BRICKS BOOKS	:" + bricksQuant);
		System.out.println("AVAILABLE SURVEY BOOKS	:" + surveyQuant);
		System.out.println("AVAILABLE DBMS BOOKS	:" + dbmsQuant);
		System.out.println("AVAILABLE JAVA MECHANICS BOOKS	:" + javaQuant);
	}

	/**
	 * this function updates everything according to user's book takings
	 * 
	 * @param quantity
	 * @param bookType
	 * @param id
	 * @return
	 */
	public static int takeBook(int quantity, int bookType, long id) {
		LocalDate dateT = LocalDate.now();
		int retvalue = 0;
		if (quantity > 0) {
			switch (bookType) {
			// Business logic for taking book
			case 1:
				if (quantity < solidMechQuant) {
					solidMechQuant -= quantity;
					debtUser.add(id);
					String date = dateT.toString();
					dateOfTaken.add(date);
					retvalue = 1;
					break;
				} else {
					System.out.println("SORRY INSUFFICIENT BOOK");
					retvalue = 0;
					break;
				}

			case 2:
				if (quantity < fluidMechQuant) {
					fluidMechQuant -= quantity;
					debtUser.add(id);
					String date = dateT.toString();
					dateOfTaken.add(date);
					retvalue = 1;
					break;
				} else {
					System.out.println("SORRY INSUFFICIENT BOOK");
					retvalue = 0;
					break;
				}
			case 3:
				if (quantity < bricksQuant) {
					bricksQuant -= quantity;
					debtUser.add(id);
					String date = dateT.toString();
					dateOfTaken.add(date);
					retvalue = 1;
					break;
				} else {
					System.out.println("SORRY INSUFFICIENT BOOK");
					retvalue = 0;
					break;
				}
			case 4:
				if (quantity < surveyQuant) {
					surveyQuant -= quantity;
					debtUser.add(id);
					String date = dateT.toString();
					dateOfTaken.add(date);
					retvalue = 1;
					break;
				} else {
					System.out.println("SORRY INSUFFICIENT BOOK");
					retvalue = 0;
					break;
				}
			case 5:
				if (quantity < dbmsQuant) {
					dbmsQuant -= quantity;
					debtUser.add(id);
					String date = dateT.toString();
					dateOfTaken.add(date);
					retvalue = 1;
					break;
				} else {
					System.out.println("SORRY INSUFFICIENT BOOK");
					retvalue = 0;
					break;
				}
			case 6:
				if (quantity < javaQuant) {
					javaQuant -= quantity;
					debtUser.add(id);
					String date = dateT.toString();
					dateOfTaken.add(date);
					retvalue = 1;
				} else {
					System.out.println("ENTER THE QUANTITY CORRECTLY");
					retvalue = 0;
					break;
				}

				break;
			default:
				System.out.print("ENTER THE BOOK NUMBER CORRECTLY!!!");
				break;
			}
		} else {
			System.out.println("SORRY WE DONT HAVE SUFFICIENT BOOKS");
		}
		return retvalue;
	}

	/**
	 * this function updates everything according to user's book retrieval
	 * 
	 * @param booknumber
	 * @param quantity
	 * @param id
	 * @return
	 */
	public static int retrieveBook(int booknumber, int quantity, long id) {
		if (quantity > 0) {
			switch (booknumber) {
			// business logic for retrieval of book
			case 1:
				solidMechQuant += quantity;
				int index = debtUser.indexOf(id); // if not exists -1
				if (index != -1) {
					debtUser.remove(index);
				}
				break;
			case 2:
				fluidMechQuant += quantity;
				index = debtUser.indexOf(id); // if not exists -1
				if (index != -1) {
					debtUser.remove(index);
				}
				break;
			case 3:
				bricksQuant += quantity;
				index = debtUser.indexOf(id); // if not exists -1
				if (index != -1) {
					debtUser.remove(index);
				}
				break;
			case 4:
				surveyQuant += quantity;
				index = debtUser.indexOf(id); // if not exists -1
				if (index != -1) {
					debtUser.remove(index);
				}
				break;
			case 5:
				dbmsQuant += quantity;
				index = debtUser.indexOf(id); // if not exists -1
				if (index != -1) {
					debtUser.remove(index);
				}
				break;
			case 6:
				javaQuant += quantity;
				index = debtUser.indexOf(id); // if not exists -1
				if (index != -1) {
					debtUser.remove(index);
				}
				break;
			default:
				System.out.println("ENTER THE BOOK NUMBER CORRECTLY!!!");
				break;
			}
		} else {
			System.out.println("ENTER THE DETAILS CORECTLY");
		}
		return 1;

	}

	/**
	 * this function is responsible for showing books according to name of the book
	 * 
	 * @param bookName
	 * @return
	 */
	public static int displayByName(String bookName) {
		switch (bookName) {
		case "SOLID MECHANICS":
			return solidMechQuant;
		case "FLUID MECHANICS":
			return fluidMechQuant;
		case "BRICKS":
			return bricksQuant;
		case "SURVEY":
			return surveyQuant;
		case "DBMS":
			return dbmsQuant;
		case "JAVA":
			return javaQuant;

		}
		return 0;
	}

	public static void displayDebtUsers() {
		System.out.println("-----DEBT USER-----");
		for (int i = 0; i < debtUser.size(); i++) {

			System.out.println("DEBT USER " + debtUser.get(i));
			System.out.println("DATE OF TAKEN:" + dateOfTaken.get(i));
			System.out.println("------------");
		}
	}
}
