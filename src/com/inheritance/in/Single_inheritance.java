package com.inheritance.in;

// Single inheritance

class Employee{
	int empid=1001;
	String name="Meghana";
	
	void work() {
		System.out.println(name+" is working fine in company");
	}
}

class Training extends Employee {
	String Subject = "java";
	void teach() {
		System.out.println(name+" is Teaching "+Subject);
	}
}

public class Single_inheritance {

	public static void main(String[] args) {
		Training t1=new Training();
		System.out.println(t1.Subject);
		t1.teach();
		System.out.println(t1.empid);   	// It was showing error because empid is private and it can accessed with in class only
		System.out.println(t1.name);
		t1.work();
		

	}

}
