package com.project;

import java.util.Arrays;
import java.util.Scanner;

public class Problems {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean status = true;
		System.out.println("=============Enter the program you want to find out===============");
		while(status) {
		System.out.println("\n1.To find out even and odd numbers in array");
		System.out.println("2.Find the number");
		System.out.println("3.Fint the missing numbers");
		System.out.println("4.Find the perfect number in arrays");
		System.out.println("5.Prime or not in arrays");
		System.out.println("6.Exit");
		int category=sc.nextInt();
		if(category==6) {
			status=false;
			continue;
		}
		switch(category) {
		case 1:
			System.out.println("Enter the size of array: ");
			int [] nums =new int[sc.nextInt()];
			int evencount=0;
			int oddcount=0;
			System.out.println("Enter the values: ");
			for(int i=0;i<nums.length;i++) {
				nums[i]=sc.nextInt();
				if(nums[i]%2==0) {
					evencount++;
				}
				else {
					oddcount++;
				}
			}
			int even[] = new int[evencount];
			int odd[] = new int[oddcount];
			int x=0;
			int y=0;
			for(int i=0;i<nums.length;i++) {
				if(nums[i]%2==0) {
					even[x++]=nums[i];
				}
				else {
					odd[y++]=nums[i];
				}
			}
			System.out.println(Arrays.toString(even)+" Even numbers");
			System.out.println(Arrays.toString(odd)+" odd numbers");
			break;
		case 2:
			int []a= {1,2,3,4,5,5,5,60,39};
			int target=5;
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]==target) {
					count++;    
				}
			}
			System.out.println("This contains 5: "+count+" times");
			break;
		case 3:
			int arr[] = {1,2,4,6,8,9};
			int max=0;
			for(int i=0;i<arr.length;i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}
			int p=1;
			while(p<=max) {
				boolean isContain=false;
				for(int i=arr.length-1;i>=0;i--) {
					if(p==arr[i]) {
						isContain=true;
						break;
					}
				}
				if(!isContain) {
					System.out.println(p);
				}
				p++;
			}
			break;
		case 4:
			System.out.println("Enter a numbers: ");
			int[] b = new int[sc.nextInt()];
			for(int i=0;i<b.length;i++) {
				b[i]=sc.nextInt();
				if(perfect(b[i])) {
					System.out.println(b[i]+" is perfect number");
				}
				else {
					System.out.println(b[i]+" is not perfect number");
				}	
			}

			break;
		case 5:
			int n []= {1,2,3,4,5,6};
			for(int i=0;i<n.length;i++) {
				if(prime(n[i])) {
					System.out.println(n[i]+" is prime");
				}
				else {
					System.out.println(n[i]+" is not prime");
				}
			}
			break;
		default:
			System.out.println("Invalid Category!");
		}

		}
	}
	private static boolean perfect(int n) {
		int count=0;
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
			if(sum==n) return true;
		}
		return false;
	}
	
	public static boolean prime(int n) {
		if(n<=1) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) return false;	
		}
		return true;
	}

}
