package com.constructor.in;


class A{
	public void Landing() {
		System.out.println("Aeroplane is Landing on the road");
	}
//	public static void main() {
//		System.out.println("overided main method");
//	}
	
}

class B extends A{
	public void Military() {
		System.out.println("Soldiers are getting ready for thewar");
	}
	public void Landing() {
			System.out.println("Helicopter is Landing on the road");
	}
	
}

public class Mains {
	public static void main(String[] args) {
//		System.out.println("Main starts");
//		A a=new A();
//		a.main();
//		System.out.println("Main Ends");
		
		A a=new A();
		a.Landing();
//		a.Military();
		
//		B b=new B();
//		b.Landing();
//		b.Military();
		
//		A a= new B();
//		a.Landing();
//		a.Military();     //child will lose its contest
		
//		B b=(B) new A();
//		b.Landing();
//		b.Military();
		

	}

}
