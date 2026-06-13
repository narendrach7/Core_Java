package com.FunctionalInterfaces;


@FunctionalInterface
interface NumberChecker {
 boolean checkNumber(int number);
}


@FunctionalInterface
interface CharChecker {
 void checkChar(char character);
}

public class Question1{

 
 public static boolean isPrime(int number) {
     if (number < 1) {
         return false;
     }
     int count=0;
     for (int i = 1; i <=number; i++) {
         if (number % i == 0) {
             count++;
         }
     }
     return count==2? true:false;
 }

 public static void main(String[] args) {
     
     
     NumberChecker numberChecker = new NumberChecker() {
         @Override
         public boolean checkNumber(int num) {
             return isPrime(num);
         }
     };

     
     
     int sampleNumber = 6;
     boolean isNumberPrime = numberChecker.checkNumber(sampleNumber);
     System.out.println("Is the number " + sampleNumber + " prime ? " + isNumberPrime);


    
     CharChecker charChecker = new CharChecker() {
         @Override
         public void checkChar(char character) {
             int asciiValue = (int) character;
             if (isPrime(character)) {
                 System.out.println("The ASCII value of '" + character + "' (" + asciiValue + ") is a prime number.");
             } else {
                 System.out.println("The ASCII value of '" + character + "' (" + asciiValue + ") is NOT a prime number.");
             }
         }
     };

     
     char sampleChar = 'A'; // ASCII value of 'A' is 65
     charChecker.checkChar(sampleChar);
 }
}
