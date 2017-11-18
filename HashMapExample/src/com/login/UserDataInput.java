package com.login;

import java.util.Scanner;

public class UserDataInput {

	public static void main(String[] args) {

		// Get the user name and password dynamically from the user
		Scanner userNameScanner = new Scanner(System.in);
		Scanner passwordScanner = new Scanner(System.in);

		try {
			System.out.print("please enter userName : ");
			String userName = userNameScanner.next();

			System.out.print("please enter password : ");
			String password = passwordScanner.next();

			DataComparision inputCheck = new DataComparision();
			boolean isValidInput = inputCheck.validateUserInput(userName, password);

			if (isValidInput) {
				System.out.println();
				System.out.println("User entered valid login cridentials");
			} else {
				System.out.println();
				System.out.println("Invalid login cridentials");
			}
		} finally {
			userNameScanner.close();
			passwordScanner.close();
		}
	}
}
