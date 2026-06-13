package com.arrays.in;

public class Missing_number {

	public static void main(String[] args) {
		int arr[] = {1,2,4,6,8,9,10};
		
//		To fine one or more missing numbers;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		int p=1;
		while(p<=max) {
			boolean isContain=false;
			for(int i=arr.length-1;i>=0;i--) {
				if(p==arr[i]) {
					isContain=true;
					break;
				}
			}
			if(!isContain) {
				System.out.println(p);
			}
			p++;
		}
		
		
		
//		To find one missing number
		int sum=0,asum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		for(int i=0;i<arr.length;i++) {	
			asum+=arr[i];
		}
		System.out.println("missing number is: "+(sum-asum));
		
	}

}
