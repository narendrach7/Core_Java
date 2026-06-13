package com.interfaces.in;


interface shape{
	void draw();
}

class Square1 implements shape{
	public void draw() {
		System.out.println("This is Square");
	}
}

class Rectangle1 implements shape{
	public void draw() {
		System.out.println("This Rectangle");
	}
}

class Circle1 implements shape{
	public void draw() {
		System.out.println("This Circle");
	}
}

class AllShapes{
	void display(shape ref) {
		ref.draw();
	}
}
	

public class Pratice {
	public static void main(String[] args) {
		AllShapes a=new AllShapes();
		Square1 s=new Square1();
		a.display(s);
		Rectangle1 r=new Rectangle1();
		a.display(r);
		Circle1 c=new Circle1();
		a.display(c);
		

	}

}
