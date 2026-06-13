package com.MethodsAndLoops;
//Business logic class
public class Rectangle{
	double length;
	double breadth;
	public double findperimeter() {
		return (length+breadth)*2;
	}
	public double findArea() {
		return (length*breadth);
	}
	public void displayingalldetails(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
		System.out.println("length: "+length+", breadth: "+breadth+", Area: "+findArea()+", Perimeter: "+findperimeter());
	}
//	public static void main(String [] args) {
//		Rectangle rec=new Rectangle();
//		rec.displayingalldetails(10.0,5.0);
//		rec.displayingalldetails(50.0,20.0);
//		
//		
//	}
}
