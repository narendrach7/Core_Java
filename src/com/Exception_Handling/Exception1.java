package com.Exception_Handling;

import java.util.Scanner;

class InvalidMobileNumber extends Exception{
	public String getMessage() {
		return "Invalid Mobile number";
	}
}

public class Exception1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile number: ");
		try {
			String num=sc.next();
			if(num.length()<10 || !num.matches("\\d{10}") || !((num.charAt(0)>'5') && num.charAt(0)<='9')) {
				throw new InvalidMobileNumber();
			}
//			for(int i=0;i<num.length();i++) {
//				if(!Character.isDigit(num.charAt(i))) {
//					throw new InvalidMobileNumber();
//				}
//			}
			System.out.println("Valid number");
		} catch (InvalidMobileNumber e) {
			System.out.println(e.getMessage());
		}
	}

}
