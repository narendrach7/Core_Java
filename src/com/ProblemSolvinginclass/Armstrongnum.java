package com.ProblemSolvinginclass;

import java.util.Scanner;

public class Armstrongnum {
	public static void AmstrongNumber(int start,int end) {
		while (start<=end) {
		int n=start;
		int count =0;
		for(int i=n;i>0;i/=10) {
			count++;
		}
		int sum=0;
		while(n>0) {
			int temp=n%10;
			sum=sum+(int)Math.pow(temp,count );
			n/=10;
		}
		if(start==sum) {
			System.out.println(start);
		}
		start ++;
	    }
	}

	public static void main(String[] args) {
		
		AmstrongNumber(100,1000);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int number = sc.nextInt();
//		int originalnum=number;
//		int sum=0;
//		int digit =0; 
//		int tempcount= number;
//		while(tempcount>0) {
//			tempcount /=10;
//			digit++;
//		}
//		int tempsum = number;
//		while (tempsum>0) {
//			int lastdigit =tempsum%10;
//			int powervalue=1;
//			for(int i=0;i<digit;i++) { 
//				powervalue *=lastdigit;
//			}
//			sum+=powervalue;
//			tempsum /=10;
//		}
//		if(sum==originalnum) System.out.println(originalnum+" is an armstrong number");
//		else System.out.println(originalnum+" is not an armstrong number");
	}

}
 