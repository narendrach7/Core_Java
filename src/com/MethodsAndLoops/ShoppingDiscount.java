package com.MethodsAndLoops;

public class ShoppingDiscount {

	public static void main(String[] args) {
		int purchasedAmount= 6000;
		boolean prime=true;
		if(purchasedAmount>5000) {
			if (prime) {
				System.out.println("You get 20% discount");
			}
			else {
				System.out.println("You get 10% discount");
			}
		}
		else {
			System.out.println("No discount, Don't Bargain!!!");
		}

	}
}
