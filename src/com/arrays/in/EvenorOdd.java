package com.arrays.in;

import java.util.Arrays;
import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int [] nums =new int[sc.nextInt()];
		int evencount=0;
		int oddcount=0;
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
		sc.close();
	}
}
