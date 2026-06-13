package com.Exception_Handling;

import java.util.Scanner;

public class Manual_Exception {
	

	public static void main(String[] args){
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Value a: ");
//		int a=sc.nextInt();
//		System.out.println("Enter the value b: ");
//		int b=sc.nextInt();
//		try {
//			if(a<b) {
//				throw new ArithmeticException();
////				ArithmeticException e=new ArithmeticException();
////				throw e;
//			}
//			int result = a-b;
//			System.out.println("Result : "+result);
//		}catch(Exception e) {
////			System.out.println(e.getMessage());// null
////			System.out.println("a is less then b, so subtraction not possible..");
//		}
		
		
		
//		try {
//			ATMmachine(300,500);
//		}catch(Exception e) {
////			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}finally {
//			System.out.println("Collect the card");
//		}
//	}
//		public static void ATMmachine(int balance, int withdrawl) {
//			if(withdrawl>balance) {
//				throw new ArithmeticException("Insufficient Balance");
//			}
//		}
		
		
	
		Insta("narendra","12345");
	}
	public static void Insta(String username, String passward){
		if(username.equals("Narendra") && passward.equals("123450")) {
			System.out.println("login successfull");
		}else {
			throw new IllegalArgumentException("Invalid username or password");
		}
	}
}
