package com.inheritance.in;

class Person{
	String name="Chandu";
	void speak() {
		System.out.println(name+" is Speaking");
	}
}

class Teaching extends Person{
	String subject="Java";
	void teach() {
		System.out.println(name+" is teaching");
	}
}

class Javaprogram extends Teaching{
	void Javaworkshop() {
		System.out.println(name+" is doing JavaWorkshop");
	}
}

public class Multi_level_inheritance {

	public static void main(String[] args) {
		Javaprogram jp=new Javaprogram();
		System.out.println("JavaProgram class properties and Behaviours");
		jp.Javaworkshop();
		System.out.println("------------------------------");
		System.out.println("TeachingClass Properties and Behaviours");
		System.out.println(jp.subject);
		jp.teach();
		System.out.println("--------------------------------");
		System.out.println("PersonClass properties and Behaviours");
		System.out.println(jp.name);
		jp.speak();

	}

}
