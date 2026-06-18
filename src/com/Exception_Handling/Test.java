package com.Exception_Handling;
class Handling {


    public static void tiMethod(int num) {
        try {
            System.out.println("10000");
            tilMethod(num);
            System.out.println("Coders");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Coders");
        }
    }


    public static void tilMethod(int num) throws ArithmeticException {
        try {
            // This will throw ArithmeticException if num is 0
            int result = 10 / num; 
            System.out.println("Completed");
        } catch (ArithmeticException e) {
            // Rethrowing with the exact expected system message format
            throw new ArithmeticException("/ by zero");
        } finally {
            System.out.println("Finally");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("--- Test Case 1: Input = 0 ---");
        Handling.tiMethod(0);


        System.out.println("\n--- Test Case 2: Input = 1 ---");
        Handling.tiMethod(1);


        System.out.println("\n--- Test Case 3: Input = 10 ---");
        Handling.tiMethod(10);


        System.out.println("\n--- Test Case 4: Input = 15 ---");
        Handling.tiMethod(15);
    }
}

