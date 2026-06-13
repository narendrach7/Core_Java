package com.Algorithom.in;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,70,80,90};
		int target=80;
		int start =0;
		int end = a.length-1;
		boolean status = false;
		while(start<=end) {
			int mid = (start+end)/2;
			if(a[mid]==target) {
				status = true;
				break;
			}
			else if(a[mid]<target) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		if(status) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
	}

}
