package com.Test.in;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int originalnum=n;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++) {
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if(originalnum==sum) System.out.println(originalnum+" is a strong number");
		else System.out.println(originalnum+" is not a strong number");
	}

}
