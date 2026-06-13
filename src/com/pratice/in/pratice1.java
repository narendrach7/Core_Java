package com.pratice.in;

public class pratice1 {

	public static void main(String[] args) {
//		Find all factors of a number
		int number = 60;
		System.out.print("Factors of " + number + " are: ");
		for (int i = 1; i <= number; i++) {
		    if (number % i == 0) {
		        System.out.print(i + " ");
		    }
		}
		
		for (int i = 1; i * i <= number; i++) {
		    if (number % i == 0) {
		        System.out.print(i + " ");
		        
		        // Find and print the paired factor (if it's not the same)
		        if (i != number / i) {
		            System.out.print((number / i) + " ");
		        }
		    }
		}

		
		
//		Check divisible by 5 and 11
//		int number=5;
//		System.out.println((number % 5 == 0 && number % 11 == 0) ? "Yes" : "No");
		
		
//		Add digit at end 
//		int a=93839,add=4;
//		int temp=a*10+add;
//		System.out.println(temp);
	
	
		
//		Remove last digit
//		int a=9309;
//		int number=a/10;
//		System.out.println(number);
		
		

//		int number = 25698;
//		  if (number < 10) {
//	            System.out.println("Swapped number: " + number);
//	            return;
//		  }
//	        int lastDigit = number % 10;
//	        int firstDigit = number;
//	        int count = 0;
//	        int temp = number;
//	        while (temp >9) {
//	            temp /= 10;
//	            count++;
//	        }
//	        firstDigit = temp;
//	        int multiplier = 1;
////	        for (int i = 0; i < count; i++) {
////	            multiplier *= 10;
////	        }
//	       multiplier=multiplier*(int) Math.pow(10, count);
//	        int middlePart = (number % multiplier) / 10;
//	        int swappedNumber = (lastDigit * multiplier) + (middlePart * 10) + firstDigit;
//
//	        System.out.println("Original: " + number);
//	        System.out.println("Swapped: " + swappedNumber);
		
		
	        
	        
//		First and last digit of a Number
//		int number = 98562;
//		int lastDigit = number % 10;
//		int firstDigit = number;
//		while (firstDigit > 9) {
//		    firstDigit /= 10;
//		}
//		System.out.println("First digit: " + firstDigit);
//		System.out.println("Last digit: " + lastDigit);
		
	
	        
	        
//		Product of digits
//		int a=383,sum=1;
//		while(a>0) {
//			sum*=a%10;
//			a/=10;
//		}
//		System.out.println(sum);
	}

}
