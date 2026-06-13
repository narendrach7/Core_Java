package com.abstraction.in;

import java.util.Scanner;

abstract class shape{
	float area;
	abstract void input();
	abstract void calcArea();
	void display() {
		System.out.println("Area: "+area);
	}
}

class rectangle extends shape{
	int l,b;
	void input() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length: ");
		l = sc.nextInt();
		System.out.println("Enter the breadth: ");
		b = sc.nextInt();
	}
	void calcArea() {
		area =l*b;
	}

}

class Square extends shape{
	int a;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side: ");
		a=sc.nextInt();
	}
	void calcArea() {
		area = a*a;
	}
}

class circle extends shape{
	float r;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		r = sc.nextFloat();
	}
	void calcArea() {
		area = 3.14f*r*r;
	}
}

class AreaCalulation{
	void allowshape(shape ref) {
		ref.input();
		ref.calcArea();
		ref.display();
	}
}

public class Shapes {

	public static void main(String[] args) {
		rectangle r1=new rectangle();
		 Square s1 = new  Square();
		 circle c1= new circle();
		 AreaCalulation a1=new AreaCalulation();
		 a1.allowshape(r1);
		 System.out.println("=====================");
		 a1.allowshape(s1);
		 System.out.println("======================");
		 a1.allowshape(c1);
		
	}

}
