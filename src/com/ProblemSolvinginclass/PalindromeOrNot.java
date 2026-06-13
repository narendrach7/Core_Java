package com.ProblemSolvinginclass;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s1.nextInt();
		int rev=0;
		int originalnum=n;
		while(n>0) {
			int digit=n%10;
			rev = rev*10+digit;
			n=n/10;
		}
		if (originalnum==rev) System.out.println(originalnum+" is a palindrome");
		else System.out.println(originalnum+" is not a palindrome");
	}

}
