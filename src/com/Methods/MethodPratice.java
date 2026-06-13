package com.Methods;

public class MethodPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(4);
		method2(5);
		MethodPratice obj=new MethodPratice();
		obj.method3(6);
		obj.method4(0);

	}
	public static void method1(int a ) {
		System.out.println(a);
	}
	public static void method2(int b) {
		System.out.println(b);
	}
	public void method3(int c) {
		System.out.println(c);
	}
	public void method4(int d) {
		System.out.println(d);
	}
}
