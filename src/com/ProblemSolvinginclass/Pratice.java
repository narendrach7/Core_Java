package com.ProblemSolvinginclass;

import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int sum=0,temp;
		temp=n;
//		int number = String.valueOf(n).length();
		while (n>0) {
			int digits = n %10;
			sum =  sum+ (digits*digits*digits) ;
			n = n/10;
		}
		if (sum == temp) System.out.println(temp+" is an armstrong number");
		else System.out.println(temp +" is not an armstrong number");
	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("is an armstrong number: "+isarmstrong(number));
//	}
//}
//	public static boolean isarmstrong(int n) {
//		int digit =0,temp;
//		temp=n;
//		while(temp>0) {
//			temp=temp/10;
//			digit ++;
//		}
//		System.out.println("number of digit: "+digit);
//		temp=n;
//		int sum=0;
//		while(temp>0) {
//			int lastdigit=temp%10;
//			sum=(int) (sum+lastdigit*lastdigit*lastdigit);
//			temp =temp/10;
//		}
//		System.out.println("sum is: "+sum);
//		if(sum==n) {
//			return true;
//		}
//		return false;
//	}


