package com.inheritance.in;



class Worker{
	void work() {
		System.out.println("Worker is working...");
	}
}

class Developer extends Worker{
	void coding() {
		System.out.println("Developer is coding...");
	}
}

class Tester extends Worker{
	void test() {
		System.out.println("Tester is testing...");
	}
}

public class Hierarchical_inheritance {
	public static void main(String[] args) {
		Developer d=new Developer();
		System.out.println("----Developer----");
		d.coding();
		d.work();
		Tester t=new Tester();
		System.out.println("----Tester----");
		t.test();
		t.work();
		
	}

}
