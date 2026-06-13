package com.abstraction.in;

import java.util.Scanner;

abstract class values{
	abstract void area();
	abstract void peremeter();
}

class square extends values{
	static int area;
	square(int area){
		this.area=area;
	}
	void area() {
		System.out.println("Area of Square is :"+ area*area);
	}
	void peremeter() {
		System.out.println("Perementer of Square is :"+4*area);
	}
}

class Rectangle extends values{
	static int length;
	static int breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void area() {
		System.out.println("Area of Rectangle is: "+length*breadth);
	}
	void peremeter() {
		System.out.println("Peremeter of Rectangle is: "+(length+breadth)*2);
	}
}

class Circle extends values{
	static double PI=3.14;
	static int radius;
	Circle(int radius){
		this.radius=radius;
	}
	
	void area() {
		System.out.println("Area of Circle is: "+PI*radius*radius);
	}
	void peremeter() {
		
	}
	void circumference() {
		System.out.println("Circumference of Circle is: "+2*PI*radius);
	}
}
class result {
	void display(values res) {
		res.area();
		res.peremeter();
	}
}


public class Main1 {
	public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter a value to find the Area and Peremeter of the Square: ");
	square s=new square(s1.nextInt());
	result r=new result();
	r.display(s);
	System.out.println("=====================================================");
	System.out.println("Enter length and breadth to find the Area and peremeter of the Rectangle: ");
	Rectangle r1=new Rectangle(s1.nextInt(),s1.nextInt());
	r.display(r1);
	System.out.println("======================================================");
	System.out.println("Enter the radius to find the Area and Circumference of circle: ");
	Circle c = new Circle(s1.nextInt());
	r.display(c);
	c.circumference();

	}

}
