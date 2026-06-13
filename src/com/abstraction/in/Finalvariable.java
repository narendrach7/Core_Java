package com.abstraction.in;

 public class Finalvariable {
	static int a;
	
	Finalvariable(int a){
		this.a=a;
		
	}

	public static void main(String[] args) {
		final int b;
		b=20;
		System.out.println(b);
		Finalvariable fk=new Finalvariable(10);
		System.out.println(fk.a);
		

	}

}
