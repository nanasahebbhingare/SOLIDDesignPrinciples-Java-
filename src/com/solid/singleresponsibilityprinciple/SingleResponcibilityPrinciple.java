package com.solid.singleresponsibilityprinciple;

/**
 * There should never be more than one reason for a class to change.
 * 
 * @author Bhingare Nana.
 * @since 2nd-Aug
 * @version 1.0
 */
public class SingleResponcibilityPrinciple {
	public static void main(String[] args) {
		UserPersistance userPersistance = new UserPersistance();
		User user = userPersistance.createUser();
		userPersistance.save(user);
	}
}