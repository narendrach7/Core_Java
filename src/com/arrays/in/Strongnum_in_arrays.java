package com.arrays.in;

import java.util.Scanner;

public class Strongnum_in_arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int[] nums=new int[sc.nextInt()]; 
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
			if(strongnum(nums[i])) {
				System.out.println(nums[i]+" is a strong number");
			}
			else {
				System.out.println(nums[i]+" is not a strong number");
			}
		}
	}

	private static boolean strongnum(int n) {
		int originalnum=n;
		int sum=0;
		if(n<=0) return false;
		while(n>0) {
			int digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++) {
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if(sum==originalnum) return true;
		return false;
	}

}
