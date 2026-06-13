package com.MethodsAndLoops;

public class Forloop {

	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				num+=i;
			System.out.println(i);
			}
		}
		System.out.println("Sum of 20 even numbers: "+num);
		
	}

}
