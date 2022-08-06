package com.solid.openclosedprinciple;

public class PhoneSubscriber extends Subscriber {

	@Override
	public double calculatedBill() {
		System.out.println("Calculate Phone Bill...!!!");
		return 0;
	}

}
