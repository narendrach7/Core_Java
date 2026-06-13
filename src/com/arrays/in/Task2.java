package com.arrays.in;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int [] nums =new int[sc.nextInt()];
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
			if(i%2==0) {
				System.out.println(nums[i]+" is even");
			}
			else {
				System.out.println(nums[i]+" is odd");
			}
		}

	}

}
