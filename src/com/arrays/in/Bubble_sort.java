package com.arrays.in;

import java.util.Arrays;

public class Bubble_sort {

	public static void main(String[] args) {
		int a[] = {1,7,50,31,96,96,47,5,82,117,25};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
