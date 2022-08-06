package com.solid.interfacesegregation;

/**
 * Should be open for extension and closed for modification.
 * 
 * @author Bhingare Nana.
 * @since 3rd-Aug
 * @version 1.0
 */
public class InterfaceSegregationPrinciple {
	public static void main(String[] args) {
		StudentInfo info = new StudentInfo();
		info.display();
		info.accept();
	}
}
