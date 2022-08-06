package com.solid.singleresponsibilityprinciple;

public class UserPersistance {
	public void save(User user) {
		System.out.println("Save User : " + user);
	}

	public User createUser() {
		User user = new User();
		user.setUserId(100);
		user.setUserName("USER-100");
		return user;
	}
}