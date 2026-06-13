package com.arrays.in;

import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		int a[] = {23,1,2,45,78,6,3,23,68};
		for(int i=0;i<a.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[minIndex]>a[j]) {
					minIndex=j;
				}
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
