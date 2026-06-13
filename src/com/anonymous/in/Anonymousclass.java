package com.anonymous.in;

interface Animal{
	void makingsound();
}

//class Dog implements Animal{
//	public void makingsound() {
//		System.out.println("bow bow......");
//	}
//}

public class Anonymousclass {
	public static void main(String[] args) {
//		Animal a=new Dog();
//		a.makingsound()
		
		// Anonymous implements Animal
		Animal a=new Animal() {
			public void makingsound() {
				System.out.println("bow bow....");
			}
		};
		// Animal a=new Anonymous();
		a.makingsound();
	}
}
