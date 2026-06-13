package com.arrays.in;

import java.util.Arrays;

public class Swap_two_numbers {

	public static void main(String[] args) {
		int []arr= {10,20,30,40,50,60,70};
		for(int i=0 ;i<arr.length-1;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
