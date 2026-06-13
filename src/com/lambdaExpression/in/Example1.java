package com.lambdaExpression.in;

interface NumberChecker{
	abstract boolean checkNumber(int num);
}
interface CharChecker{
	abstract void checkChar(char a);
}
public class Example1 {
	public static boolean isPrime(int number) {
		if(number<1) return false;
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		return count==2? true:false;
	}
	public static void main(String[] args) {
		NumberChecker check= num -> isPrime(num);
		int number=20;
		System.out.println(number+" is prime? "+check.checkNumber(10));
	}
	
	
}
