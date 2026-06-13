package com.abstraction.in;

abstract class plane{
	abstract void fly();
	abstract void takeoff();
} 

class Cargo extends plane {
	void fly() {
		System.out.println("Cargo plane is flying with goods");
	}
	void takeoff() {
		System.out.println("Cargo plane as tookoff in high altitude");
	}
}

class passenger extends plane{
	void fly() {
		System.out.println("passenger plane is flying with people");
	}
	void takeoff() {
		System.out.println("passenger plane as tookoff in medium altitude");
	}
	
}

class Military extends plane{
	void fly() {
		System.out.println("Military plane is flying with weapons");
	}
	void takeoff() {
		System.out.println("Military plane as tookoff in lowaltitude");
	}
}




public class MainClass {

	public static void main(String[] args) {
		Cargo c1=new Cargo();
		c1.fly();
		c1.takeoff();
		System.out.println("==============================");
		passenger p1=new passenger();
		p1.fly();
		p1.takeoff();
		System.out.println("===============================");
		Military M1=new Military();
		M1.fly();
		M1.takeoff();

	}

}
