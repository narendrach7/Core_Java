package com.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int a=5; 
		System.out.println(a++ + ++a);
		int c=3; int b=c++ + c++ + ++c; 
		System.out.println(b);
		int d=10; 
		System.out.println(--d + d--);
	}

}
