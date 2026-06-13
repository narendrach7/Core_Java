package com.operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int a=5,b=10;
		System.out.println(a>b?a:b);
		int x=7; 
		System.out.println(x%2==0?"Even":"Odd");
		int c=3,d=4,e=5; 
		System.out.println(c>d?(c>e?c:e):(d>e?d:e));

	}

}
