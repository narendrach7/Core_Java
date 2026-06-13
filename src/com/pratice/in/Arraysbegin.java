package com.pratice.in;

import java.util.Scanner;



import java.util.Arrays;

public class Arraysbegin {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the arrays: ");
		int [][] arr=new int[3][3];
		for(int i=0;i<arr.length;i++) {
		 // for each col in every row
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			 // for each col in every row
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
		}
		
		
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		
		
//		for(int[] a:arr) {
//			System.out.println(Arrays.toString(a));
//		}

		
	}

}
