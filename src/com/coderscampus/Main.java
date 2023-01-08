package com.coderscampus;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		UserService userService = new UserService();
		User[] users = userService.getUserArray();

		Scanner scanner = new Scanner(System.in);
		boolean success = false;
		int attempt = 0;
		while (attempt < 3) {
			System.out.println("Please enter Username:");
			String username = scanner.next();
			System.out.println("Please enter Password:");
			String password = scanner.next();
			
			if (userVal (users, username, password) != true) {
				if (attempt < 2) {
					System.out.println("Invalid Login, Please try again");					
				}
				attempt++; 
			} else {
				success = true;
				break;
			}
			
		}
		if (success != true) {
			System.out.println("Too many attempts, you are locked out");
		}
		scanner.close();
	}

	

	private static boolean userVal(User[] users, String username, String password) {

		for (User user : users)
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				System.out.println("Welcome " + user.getName());
				return true;
			}
		return false;

	}

}
