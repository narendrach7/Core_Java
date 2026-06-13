package com.arrays.in;

public class Find_the_leaders_in_array {
	public static void main(String[] args) {
		int a[] = {16, 17, 4, 3, 5, 2};
	         
	        for (int i = 0; i < a.length; i++) {
	            boolean isLeader = false;
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[i] <= a[j]) {
	                    isLeader = true;
	                    break;
	                }
	            }
	            if (!isLeader) {
	                System.out.print(a[i] + " ");
	            }
	        }
	}
}
