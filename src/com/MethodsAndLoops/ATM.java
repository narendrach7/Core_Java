package com.MethodsAndLoops;

public class ATM {

	public static void main(String[] args) {
		int balance = 10000;
		int withdraw = 15000;
		if (withdraw<=balance) {
			balance = balance-withdraw;
			System.out.println("Withdrawl Successful");
			System.out.println("Remaining Balance: "+balance);
		}
		else {
			System.out.println("Insufficient balance");
			System.out.println("Current balance: "+balance);
		}
	}

}
