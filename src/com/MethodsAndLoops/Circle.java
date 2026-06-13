package com.MethodsAndLoops;
//   Business logic class
public class Circle {
	static double pi=3.14;
	int radius;
	public double Area() {
		return pi*radius*radius;
	}
	public double Circumfernce() {
		return 2*pi*radius;
	}
	public void initializevalues(int radius) {
		this.radius=radius;
	}
	public void display() {
		double Area =Area();
		double Circumference= Circumfernce();
		System.out.println("radius: "+radius+ " Area of the circle: "+Area+" Circumfernce of the Circle: "+Circumference);

	}

//	public static void main(String[] args) {
//		Circle c1=new Circle();
//		c1.initializevalues(6);
//		c1.display();
//		
//
//	}

}
