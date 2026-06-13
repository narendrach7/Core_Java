package com.Matrix.in;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a array size: ");
//	int row = sc.nextInt();
//	int columns = sc.nextInt();
//	int arr[][]= new int[row][columns];
//	System.out.println("Enter the values: ");
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[0].length;j++) {
//			arr[i][j]=sc.nextInt();
//		}
//	}
	
//	print the sum of elements in the ROW
//	for(int i=0;i<arr.length;i++) {
//		int sum=0;
//		for(int j=0;j<arr[i].length;j++) {
//			System.out.print(arr[i][j]+" ");
//			sum+=arr[i][j];
//		}
//		System.out.println(" -> "+sum);
//	}
	
	
//	Sum of elements in the columns
//	for(int i=0;i<arr.length;i++) {
//		int sum=0;
//		for(int j=0;j<arr[i].length;j++) {
//			System.out.print(arr[i][j]+" ");
//				sum+=arr[j][i];
//			
//		}
//		System.out.println("->"+sum);
//		System.out.println();
//	}

	
	
//	Find diagonal sum of the given array element
//	int sum=0;
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[i].length;j++) {
//			System.out.print(arr[i][j]+" ");
//			if(arr[i]==arr[j]) {
//				sum+=arr[i][j];
//			}
//		}
//		System.out.println();
//	}
//	System.out.println(sum);
	
	
//	find the sum of all the elements in array
//	int sum=0;
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[i].length;j++) {
//			System.out.print(arr[i][j]+" ");
//			sum+=arr[i][j];
//		}
//		System.out.println();
//	}
//	System.out.println(sum);
	
	
	
//	find wherethere the target element is present in array
//	int target=6;
//	boolean status=false;
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[i].length;j++) {
//			if(arr[i][j]==target) {
//				status=true;
//				break;
//			}
//		}
//	}
//	System.out.println(status? "Element found":"Element not found");
	
	
	
//	find the max and min elements in an array
	
//	int min=arr[0][0];
//	int max=arr[0][0];
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[i].length;j++) {
//			if(min>arr[i][j]) {
//				min=arr[i][j];
//			}
//			else if(max<arr[i][j]) {
//				max=arr[i][j];
//			}
//		}
//	
//	}
//	System.out.println(min+" "+max);

	
	
//	write a program to check the give matrix is diagonal matrix or not
//boolean status =true;
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[i].length;j++) {
//			if(i!=j) {
//				if(arr[i][j]!=0) {
//					status =false;
//					break;
//				}
//			}
//		}
//	}
//	System.out.println(status? "true":"false");
	
	
//	check wherether the given matrix is scalar matrix or not
//	boolean status=true;
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[i].length;j++) {
//			if(i!=j && arr[i][j]!=0) {
//				status=false;
//				break;
//			}
//			else if(i==j && arr[i][j]!=arr[0][0]) {
//				status=false;
//				break;
//			}
//		}
//	}
//	System.out.println(status? "true":"false");
	
		
		
//	write a program to add the elements
//		int a[][] = {{1,2,3},{3,4}};
//		int b[][] = {{7,8},{9,10}};
		
		
		
//	write a program to check union matrix or not
//		int a[][] = {{1,2},{3,4,},{3,4}};
//		int b[][] = {{7,8},{9,10},{9,10}};
//		
//		int n=a.length;
//		int m=a[0].length;
//		int c[][] = new int[n][m+m];
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<(m+m);j++) {
//				if(j>=m) {	
//					c[i][j]=b[i][j%m];	
//				}
//				else {
//					c[i][j]=a[i][j];
//				}
//			}
//		}
//		System.out.println(Arrays.deepToString(c));
	

//	Write a program to print the border matrix
		int a[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		int n= a.length;
		int m=a[0].length;
		for(int i=0;i<n;i++) {
			System.out.print(a[0][i]);
		}
		for(int i=1;i<n;i++) {
			System.out.print(a[i][m-1]);
		}
		for(int i=n-2;i>=0;i--) {
			System.out.print(a[n-1][i]);
		}
		for(int i=n-2;i>0;i--) {
			System.out.print(a[i][0]);
		}
		
	}

}
