package com.solid.dependencyinversionprinciple;

public class DebitCard implements IBankCard {

	@Override
	public void pay(Double amt) {
		System.out.println("Pay Throw DebitCard : " + amt);
	}
}