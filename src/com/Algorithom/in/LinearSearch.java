package com.Algorithom.in;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60};
		int target =40;
		boolean status=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]== target) {
				status=true;
				break;
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
