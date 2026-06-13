package com.WrapperClass.in;

public class UtilityMethod3 {

	public static void main(String[] args) {
		//Non - primitive to primitive
		Integer i1= 100;
		//unboxing
//		int i = Integer.valueOf(i1);
		
		
		//***Value()
		int i = i1.intValue();
		System.out.println(i);
		
		float f1=i1.floatValue();
		System.out.println(f1);
		
		byte b1=i1.byteValue();
		System.out.println(b1);
		
		short s1=i1.shortValue();
		System.out.println(s1);
		
		long l1=i1.longValue();
		System.out.println(l1);
	}

}
