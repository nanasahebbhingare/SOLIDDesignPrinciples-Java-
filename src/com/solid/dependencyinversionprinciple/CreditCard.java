package com.solid.dependencyinversionprinciple;

public class CreditCard implements IBankCard{

	@Override
	public void pay(Double amt) {
		System.out.println("Pay Throw CreditCard : " + amt);
	}
}
