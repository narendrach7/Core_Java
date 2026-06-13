package com.scannerclass.in;
import java.util.Scanner;

public class Readingfromuser {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a character: ");
		String name=s1.next();
		System.out.println("Entered character is: "+name);

	}

}
