package com.solid.dependencyinversionprinciple;

/**
 * High Level modules should not depend upon low level modules. Both should
 * depend upon abstractions>
 * 
 * @author Bhingare Nana.
 * @since 6rd-Aug
 * @version 1.0
 */
public class DependencyInversionPrinciple {
	public static void main(String[] args) {
		IBankCard debitCard = new DebitCard();
		debitCard.pay(100.00);
		IBankCard creditCard = new CreditCard();
		creditCard.pay(150.00);
	}
}