package com.arrays.in;

import java.util.Arrays;
import java.util.Scanner;

public class Prime_or_not_in_arrays {
	
	public static boolean prime(int n) {
		if(n<=1) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) return false;	
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		int n []= {1,2,3,4,5,6};
		for(int i=0;i<n.length;i++) {
			if(prime(n[i])) {
				System.out.println(n[i]+" is prime");
			}
			else {
				System.out.println(n[i]+" is not prime");
			}
		}

		
		
//		int num =6;
//		int count=0;
//		for(int i=1;i<num;i++) {
//			if(num%i==0) {
//				count++;
//			}
//		}
//		if(count==2) System.out.println(num+" is a prime number"); 
//		else System.out.println(num+" is not a prime number");
//	}
		
		
		
		
//		int a[] = {10,20,30,40,500};
//		int b[] = {1,2,3,4,5};
//		int size= a.length+b.length;
//		int c[] =new int[size];
//		int j=0;
//		for(int i=0;i<a.length;i++) {
//			c[j++]=a[i];
//		}
//		for(int i=0;i<b.length;i++) {
//			c[j++]=b[i];
//		}
//		System.out.println(Arrays.toString(c));
		
		
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size of 1array: ");
//		int a[] =new int[sc.nextInt()];
//		System.out.println("Enter the size of 2array: ");
//		int b[] = new int[sc.nextInt()];
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
//		for(int j=a.length;j>0;j++) {
//			a[j]=sc.nextInt();
//		}
//		System.out.println(Arrays.toString(a));
//		
	
		

	}

}
