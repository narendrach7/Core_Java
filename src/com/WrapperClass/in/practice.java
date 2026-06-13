package com.WrapperClass.in;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		String input=sc.nextLine();
//		Integer i= Integer.parseInt(s);
//		int sum=0;
//		while(i>0) {
//			int digit = i%10;
//			sum+=digit;
//			i/=10;
//		}
//		System.out.println(sum);
		
//		Integer x=null;
//		int y=x;
//		System.out.println(y);
		

        if (isValid(input)) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }
    }

    public static boolean isValid(String s) {
        // 1. Check length (must be 10 digits)
        if (s.length() != 10) {
            return false;
        }

        // 2. Check first digit using wrapper class logic
        char firstChar = s.charAt(0);
        if (firstChar < '6' || firstChar > '9') {
            return false;
        }

        // 3. Ensure all characters are digits using Character wrapper class
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;
		
	}
}
