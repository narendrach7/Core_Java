package com.constructor.in;

public class Main {
	String name;
	int id;
	Main(){
		System.out.println("NO paramitarized constructor");
	}
	Main(String name,int id){ 
		this();
		this.name=name;
		this.id=id;
		System.out.println("Name: "+name+"id: "+id);
	}

	public static void main(String[] args) {
		Main m = new Main("Narendra",1);
		

	}

}
