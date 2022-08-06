package com.solid.liskovsubstitutionprinciple;

/**
 * We Should be to substitute base objects with child objects and this should
 * not alter behavior / Characteristics of program.
 * 
 * @author Bhingare Nana.
 * @since 3rd-Aug
 * @version 1.0
 */
public class LiskovSubstitutionPrinciple {
	public static void main(String[] args) {
		IShape rectangle = new Rectangle(10, 20);
		System.out.println("Ragtangle : " + rectangle.computeArea());

		IShape squre = new Squre(20);
		System.out.println("Squre : " + squre.computeArea());
	}
}
