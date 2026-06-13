package com.constructor.in;



class parent{
	String name="Hidi";
	int age=99;
	parent(){
		System.out.println("parent class no parameterized consturctor");
	}	
	parent(String name){
		System.out.println("parent class parameterized consturctor");
		System.out.println(name);
	}
}



class child extends parent{
	public child(){
		this(3,4);
		System.out.println("child class no parameterized construcotr");
	}
	public child(int a,int b) {
		super("kiran");
		System.out.println("child class parameterized constructor");
		System.out.println(a+b);
	}
}




public class constructor_chaining {
	public static void main(String[] args) {
		child c1=new child();
		
	}
}

