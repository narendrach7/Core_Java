package com.Test.in;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=s.nextInt();
		int sum=0;
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				sum = sum+i;
			}
		}
			if(sum==a) {
				System.out.println(a+" is perfect number");
			}
			else {
				System.out.println(a+" is not perfect number");
			}
		
	}
}


