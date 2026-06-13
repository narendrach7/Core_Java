package com.arrays.in;

public class Duplicate_Elements {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,3,5,6,4,7};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					System.out.println(a[i]+" repeted "+ count);
				}
			}
		}
	}

}
