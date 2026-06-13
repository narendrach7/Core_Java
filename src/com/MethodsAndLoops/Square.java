package com.MethodsAndLoops;
//Business logic class
public class Square {
	double a;
	public double area() {
		return a*a;
	}
	public double perimeter() {
		return 4*a;
	}
	public void display(double a) {
		this.a=a;
		System.out.println("Sides: "+a+"Perimeter of Square: "+perimeter()+"Area of Square: "+area());
	}

//	public static void main(String[] args) {
//		Square s1=new Square();
//		s1.display(4);
//
//	}

}
