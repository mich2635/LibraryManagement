package com.librarymanagement;

import java.util.ArrayList;

public class LoginAndRegistration {
	static ArrayList<Long> idList = new ArrayList<Long>();
	static ArrayList<Long> passwordList = new ArrayList<Long>();

	/**
	 * This function validates the user id and password for log in
	 * 
	 * @param ID
	 * @param password
	 * @return
	 */
	public static boolean registration(long ID, long password) {
		boolean verify = false;
		try {
			idList.add(ID);
			passwordList.add(password);
			verify = true;
			return verify;

		} catch (Exception e) {
			System.out.println("ENTER THE DETAILS CORRECTLY");
			return verify;
		}
	}

	/**
	 * This function is used to register users
	 * 
	 * @param ID
	 * @param password
	 * @return
	 */
	public static boolean login(long ID, long password) {
		boolean loggedIn = false;
		for (int i = 0; i < idList.size(); i++) {
			if (ID == idList.get(i) && password == passwordList.get(i)) {
				loggedIn = true;
			}
		}
		return loggedIn;
	}

	/**
	 * This function is used to display the registered users
	 */
	public static void displayRegisters() {
		for (int i = 0; i < idList.size(); i++) {
			System.out.println("-----REGISTERED USER" + (i + 1) + "-----");
			System.out.println("REGISTERED USER:" + idList.get(i));
			System.out.println("REGISTERED PASSWORD:" + passwordList.get(i));
		}
	}
}
