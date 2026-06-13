package com.Learning_in_private.in;

public class OrderAgonosticsBinarySearch {

	public static void main(String[] args) {
//		int arr [] = {-18,-12,-4,0,2,3,4,15,16,18,22 ,45,89};
		int arr[] = {99,80,75,22,11,10,5,2,-3};
		int target =22;
		
		System.out.println(orderAgonosticsBs(arr,target));

	}
	static int orderAgonosticsBs(int [] arr,int target) {
		int start=0;
		int end = arr.length-1;
		// find whether athe array is sorted in ascending or descending
		boolean isAsc=arr[start] < arr[end];
		
		
		while(start <=end) {
//			find the middle element
//			int mid = (start + end )/ 2; // might be possible the (start + end)
			int mid = start +(end-start)/2;
			
			if(arr[mid]== target) return mid;
			
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid -1;
				}
				else {
					start = mid +1;
				}
			}
			else {
				if(target > arr[mid]) {
					end = mid -1;
				}
				else{
					start = mid +1;
				}
			}
		}
		return -1;
	}

}
