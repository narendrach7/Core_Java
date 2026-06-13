package com.MethodsAndLoops;

public class ELC {
//    Executable logic class 
	public static void main(String[] args) {
		Rectangle rec=new Rectangle();
		rec.displayingalldetails(10.0,5.0);
		rec.displayingalldetails(50.0,20.0);
		
		System.out.println("-----------------------------------------------------------------------");
		
		Square s1=new Square();
		s1.display(4);
		
		System.out.println("-----------------------------------------------------------------------");
		
		Circle c1=new Circle();
		c1.initializevalues(6);
		c1.display();

	}

}
