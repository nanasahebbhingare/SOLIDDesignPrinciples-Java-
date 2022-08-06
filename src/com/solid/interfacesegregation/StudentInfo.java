package com.solid.interfacesegregation;

public class StudentInfo implements IAccept, IDisplay {

	@Override
	public void display() {
		System.out.println("In display method...!!");
	}

	@Override
	public void accept() {
		System.out.println("In accept method...!!");
	}
}