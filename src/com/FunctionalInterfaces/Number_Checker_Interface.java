package com.FunctionalInterfaces;
import java.util.Scanner;
import java.util.function.Predicate;


public class Number_Checker_Interface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		Predicate<Integer> s=new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				if(num<=1) {
					return false;
				}
				for(int i=2;i<num/2;i++) {
					if(num%i==0) {
						return false;
					}
				}
				return true;
			}
		};
		if(s.test(n)) {
			System.out.println(n+" is a prime number");
		}else {
			System.out.println(n+" not a prime number");
		}	
	}
}
