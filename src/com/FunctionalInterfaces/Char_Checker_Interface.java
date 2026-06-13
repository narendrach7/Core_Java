package com.FunctionalInterfaces;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Char_Checker_Interface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter a Character: ");
		char c=sc.next().charAt(0);
		Consumer<Character> CharChecker=new Consumer<Character>() {
			@Override
			public void accept(Character ch) {
				int n=(int)ch;
				int count=0;
				for(int i=1;i<=n;i++) {
					if(n%i==0) {
						count++;
					}
				}
				System.out.println((count==2)? ch+" prime":ch+" not Prime");
			}
		};
		CharChecker.accept(c);
		
		
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		Predicate<Integer> NumberChecker=new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				int count=0;
				for(int i=1;i<=num;i++) {
					if(num%i==0) {
						count++;
					}
				}
				return (count==2)? true:false;
			}
		};
		if(NumberChecker.test(n)) {
			System.out.println(n+" is a prime number");
		}else {
			System.out.println(n+" not a prime number");
		}
	}
	public static boolean isPrime(int number) {
		boolean status=false;
		if(Character.isDigit(number)) {
			
		}
		return status;
		}
}
