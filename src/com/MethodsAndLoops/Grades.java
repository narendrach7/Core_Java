package com.MethodsAndLoops;

public class Grades {

	public static void main(String[] args) {
		
		char grade='c';
		if (grade=='A'|| grade=='a') {
			System.out.println("Marks in between 91 to 100");
		}
		else if (grade== 'B' || grade =='b') {
			System.out.println("Marks in between 76 to 90");
		}
		else if (grade=='c' || grade=='C') {
			System.out.println("Marks in between 51 to 75");
		}
		else if (grade=='D' || grade=='d') {
			System.out.println("Marks in between 36 to 50");
		}
		else if (grade=='f' || grade=='F') {
			System.out.println("Marks in between 0 to 35");
		}
		else {
			System.out.println("Invaild Grade");
		}
	}

}
