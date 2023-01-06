package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		UserService userService = new UserService();
		User [] users = new User[4];
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			String line;
		
			int i=0;
			while ((line = fileReader.readLine()) != null) {
				String [] values = line.split(",");
				String username = values [0];
				String password = values [1];
				String name = values [2];
				
				users[i] = userService.CreateUser(username, password, name);
				i++;
				
				
		}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Username:");
		String username = input.next();
		System.out.println("Please enter Password:");
		String password = input.next();
		
		for (User user : users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				System.out.println("Welcome " + user.getName());
				break;
			}	else {
				System.out.println("Invalid login. Please Try Again");
				
			}
			{
			
			}
		}
			}

	}

