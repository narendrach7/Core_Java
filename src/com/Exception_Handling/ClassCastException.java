package com.Exception_Handling;

class Animal{
	
}
class Dog extends Animal{
	public static void Bark() {
		System.out.println("Dog is Barking as Bow-Bow");
	}
}

public class ClassCastException {

	public static void main(String[] args) {
//		Dog a=new Animal();
//		Dog b=new Dog();
//		b.Bark();
		Animal a =new Dog();
		Dog b =(Dog) a;
		b.Bark();
	}
}
