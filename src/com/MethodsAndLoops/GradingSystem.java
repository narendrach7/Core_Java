package com.MethodsAndLoops;

public class GradingSystem {
	public static void studentMarks(int marks) {
		System.out.println(marks+" Marks");

	        if (marks < 0 || marks > 100) {
	            System.out.println("Invalid marks");
	        } 
	        else if (marks <= 35) {
	            System.out.println("Fail");
	        } 
	        else if (marks <= 50) {
	            System.out.println("D Grade");
	        }
	        else if (marks <= 75) {
	            System.out.println("C Grade");
	        } 
	        else if (marks <= 90) {
	            System.out.println("B Grade");
	        } 
	        else if(marks<=100) {
	            System.out.println("A Grade");
	        }
	}
	public static void main(String[] args) {
		studentMarks(91);
		System.out.println("---------");
		studentMarks(86);
		System.out.println("---------");
		studentMarks(32);
		

	}

}
