package com.ProblemSolvinginclass;
import java.util.Scanner;
public class FibonacciNumber {

	    public static int getFibonacci(int n) {
	        if (n <= 0) return 0;
	        if (n == 1) return 1;

	        // Create an array to store all calculated Fibonacci numbers
//	        int[] fib = new int[n + 1];
//	        fib[0] = 0;
//	        fib[1] = 1;
//
//	        // Build the sequence without calling any methods
//	        for (int i = 2; i <= n; i++) {
//	            fib[i] = fib[i - 1] + fib[i - 2];
//	        }
//
//	        return fib[n];
	        
	        
	        int prev = 0;   // fib[0]
	        int curr = 1;   // fib[1]
	     
	        for (int i = 2; i <= n; i++) {
	            int next = prev + curr; // compute next Fibonacci
	            prev = curr;            // shift forward
	            curr = next;
	        }
	       
	        return curr; 
	    }

	    public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int n=s.nextInt();
	        System.out.println("Fibonacci at position " + n + " is: " + getFibonacci(n));
	   }

}
