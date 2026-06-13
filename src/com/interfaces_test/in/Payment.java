package com.interfaces_test.in;

import java.util.Scanner;

interface pay{
	double balance=7000;
	double withdraw=2000;
}

class UPI implements pay {
	void upiPayment() {
		System.out.println("You have paid with upi remaning balance: "+(balance-withdraw));
	}
}

class CreditCard implements pay{
	void creditcardpayment() {
		System.out.println("You have paid with Credit Card remaining balance: "+(balance-withdraw));
	}
}

public class Payment {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter which payment method you want to pay: \n1.UPI \n2.CreditCard");
	int s=sc.nextInt();
	UPI u1=new UPI();
	CreditCard c1=new CreditCard();
	switch(s){
		case 1:
			u1.upiPayment();
			break;
		case 2:
			c1.creditcardpayment();
			break;
		default:
			System.out.println("Enter a valid payment method");
	}
	
	}
}
