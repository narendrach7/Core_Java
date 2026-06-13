package com.Learning_in_private.in;

public class EvenDigitsPresentInarray {

	public static void main(String[] args) {
		int [] arr= {18,124,9,1764,98,1,5235,98};
		System.out.println(findNumbers(arr));

	}
	static int findNumbers(int [] nums) {
		int count=0;
		for(int num: nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}
	
//	Method to check whether a number contains even digits or not
	static boolean even(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
	return count%2==0;
	}

}
