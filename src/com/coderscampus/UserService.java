package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserService {

	public User createUser (String username, String password, String name) {
		User user = new User ();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;
	}
	
	public User[] getUserArray() {
		User[] users = new User[4];
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			String line;

			int i = 0;
			while ((line = fileReader.readLine()) != null) {
				String[] values = line.split(",");
				String username = values[0];
				String password = values[1];
				String name = values[2];

				users[i] = createUser(username, password, name);
				i++;

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return users;
	}









}
