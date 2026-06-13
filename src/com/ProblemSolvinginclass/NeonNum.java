package com.ProblemSolvinginclass;

import java.util.Scanner;

public class NeonNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int square = n*n;
		int sum =0;
		while(square>0) {
			int digit = square%10;
			sum +=digit;
			square /=10;
		}
		if(sum==n) System.out.println(n+" is an neon number");
		else System.out.println(n+" is not an neon number");
	}

}
