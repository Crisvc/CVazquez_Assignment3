package com.coderscampus;

public class UserService {

	public User CreateUser (String username, String password, String name) {
		User user = new User ();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;
	}
}
