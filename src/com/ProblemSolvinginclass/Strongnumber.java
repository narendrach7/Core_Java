package com.ProblemSolvinginclass;

import java.util.Scanner;

public class Strongnumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		int originalnum=n;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++) {
				fact*=i;
			}
			sum+=fact;
			n=n/10;
		}
		if(sum==originalnum) {
			System.out.println(originalnum+": is a strong number");
		}
		else {
			System.out.println(originalnum+": is not a strong number");
		}
		
		
		
//		int sum=0;
//		while(n>0) {
//			int temp=n%10;
//			int fact=1;
//			for(int i=temp;i>0;i--) {
//				fact*=i;
//			}
//			n/=10;
//			sum+=fact;
//		}
//		if(originalnum==sum)
//		System.out.println("Strong");
		
	}

}