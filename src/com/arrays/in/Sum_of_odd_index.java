package com.arrays.in;

import java.util.Scanner;

public class Sum_of_odd_index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int [] nums =new int[sc.nextInt()];
		int sumofodd=0;
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
			if(i%2!=0) {
				sumofodd+=nums[i];
			}
		}
		System.out.println(sumofodd);
	}

}
