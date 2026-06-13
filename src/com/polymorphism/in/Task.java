package com.polymorphism.in;

class Payment{
	public void paying() {
		System.out.println("Processing Payment");
	}
}

class Upipayment extends Payment{
	public void paying() {
		System.out.println("Paying using UPI");
	}
}

class Creditcardpayment extends Payment{
	public void paying() {
		System.out.println("paying using creditcard");
	}
}

public class Task {

	public static void main(String[] args) {
	
		Payment p=new Upipayment();
		p.paying();
		Payment p1=new Creditcardpayment();
		p1.paying();
		Payment p2=new Payment();
		p2.paying();
	
		

	}

}
