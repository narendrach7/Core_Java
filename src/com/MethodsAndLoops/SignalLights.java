package com.MethodsAndLoops;

import java.util.Scanner;

public class SignalLights {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the signal Color");
		String light =sc.nextLine();
		
//		String light= "Red";
		switch(light) {
			case "Red":
				System.out.println("Stop");
				break;
			case "Gread":
				System.out.println("you can go");
				break;
			case "Yellow":
				System.out.println("Ready to go");
				break;
			default:
				System.out.println("Go....");
		}
			

	}

}
