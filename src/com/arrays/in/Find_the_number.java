package com.arrays.in;

import java.util.Scanner;

public class Find_the_number {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,5,5,6,7};
		int target = 5;
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				count++;
			}
		}
		System.out.println("This contains 5: "+count+" times");
	}
}
