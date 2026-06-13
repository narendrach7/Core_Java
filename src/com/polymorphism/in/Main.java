package com.polymorphism.in;

public class Main {

	public static void main(String[] args) {
	float a=10.0f;
	float b=20.0f;
	add(a,b);
	}
	public static void add(byte a, byte b) {
		System.out.println("Byte values");
	}
	public static void add(int a, int b) {
		System.out.println("Integer values");
	}
	public static void add(long a,long b) {
		System.out.println("Long values");
	}
//	public static void add(float a, float b) {
//		System.out.println("Fload values");
//	}
	public static void add(double a,double b) {
		System.out.println("double values");
	}
	public static void add(Integer a,Integer b) {
		System.out.println("Wrapper class");
	}

}
