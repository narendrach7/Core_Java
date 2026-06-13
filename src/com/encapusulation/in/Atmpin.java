package com.encapusulation.in;

import java.util.Scanner;

public class Atmpin {
	private int pin;
	public void setpin(int pin) {
		if(pin>=1000 && pin<10000) {
			this.pin=pin;
		}
		else {
			System.out.println("Invalid pin");
		}
	}
	public int getpin() {
		return pin;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the ATM pin to set: ");
		Atmpin ap=new Atmpin();
		ap.setpin(s.nextInt());
		System.out.println("Atmpin: "+ap.getpin());

	}

}
