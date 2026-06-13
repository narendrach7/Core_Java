package com.Exception_Handling;

public class ThrowsKeyword{
	public static void Bank(int withdrawl,int balance) throws ArithmeticException,ArrayIndexOutOfBoundsException{
		if(balance<withdrawl) {
			throw new ArithmeticException("Insufficient Balance");
		}
		balance = balance-withdrawl;
		System.out.println("Amount withdrawn is : "+withdrawl);
		System.out.println("Remaining balance is: "+balance);
		System.out.println("------------------------");
		int arr[]= {28,18,34,24,21};
		System.out.println(arr[5]);
	}
	public static void main(String[] args) {
		try {
			Bank(1000,5000);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
	}
}
