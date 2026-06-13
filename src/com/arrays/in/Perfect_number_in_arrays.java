package com.arrays.in;

import java.util.Scanner;

public class Perfect_number_in_arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers: ");
		int[] nums = new int[sc.nextInt()];
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
			if(perfect(nums[i])) {
				System.out.println(nums[i]+" is perfect number");
			}
			else {
				System.out.println(nums[i]+" is not perfect number");
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

}
