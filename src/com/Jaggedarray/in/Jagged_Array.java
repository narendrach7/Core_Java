package com.Jaggedarray.in;

import java.util.Arrays;
import java.util.Scanner;

public class Jagged_Array {

	public static void main(String[] args) {
//		int rows=3;
//		int a[][] =new int[rows][];// step 1: Adding the rows(number of rows)
//		a[0]=new int[3]; // Assigning the columns  size
//		a[1]=new int[1];
//		a[2]=new int[2];
//		a[0][0]=1;// Adding the elements
//		a[0][1]=2;
//		a[0][2]=3;
//		a[1][0]=4;
//		a[2][0]=5;
//		a[2][1]=6;
//		System.out.println(Arrays.deepToString(a));
		
//	write a program to print the elements wrt dinamic jagged array	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the array Size: ");
//		int row=sc.nextInt();
//		int a[][]= new int[row][];
//		for(int i=0;i<row;i++) {
//			System.out.println("Enter the columns for the row: "+(i+1)+" :");
//			a[i]=new int[sc.nextInt()];
//			for(int j=0;j<a[i].length;j++) {
//				System.out.println("Enter the element for "+i+" "+j+" index");
//				a[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println(Arrays.deepToString(a));
		
//		write a program to covert a normal array into jagged array
//		[1,2,3,4,5,6] -> [[1,2,3],[4],[5,6]]
//		int arr[]= {1,2,3,4,5,6};
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the array Size: ");
//		int row=sc.nextInt();
//		int a[][]= new int[row][];
//		for(int i=0;i<row;i++) {
//			System.out.println("Enter the columns for the row: "+(i+1)+" :");
//			a[i]=new int[sc.nextInt()];
//		}
//		int r=0;
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				a[i][j]=arr[r++];
//			}
//		}
//		System.out.println(Arrays.deepToString(a));
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the array Size: ");
//		int row=sc.nextInt();
//		int a[][]= new int[row][];
//		for(int i=0;i<row;i++) {
//			a[i]=new int[i+1];
//			for(int j=0;j<a[i].length;j++) {
//				a[i][j]=(i+1)*(j+1);
//				System.out.print(a[i][j]+" ");
//			}
//		System.out.println();
//		}
//		System.out.println(Arrays.deepToString(a));
		
		
		
//		write a program to print which row has a max elements
//		[1,2]
//		[3,4,5]
//		[6]
//		[7,8,9,10]
//		3rd index row is having maximum elements 
//		no of elements ->4
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the array Size: ");
//		int row=sc.nextInt();
//		int a[][]= new int[row][];
//		int maxElements =0;
//		int maxRowIndex=-1;
//		for(int i=0;i<row;i++) {
//			System.out.println("Enter the columns for the row: "+(i+1)+" :");
//			a[i]=new int[sc.nextInt()];
//			for(int j=0;j<a[i].length;j++) {
//				System.out.println("Enter the element for "+i+" "+j+" index");
//				a[i][j]=sc.nextInt();
//			}
//			if(a[i].length>maxElements) {
//				maxElements =a[i].length;
//				maxRowIndex =i;
//			}
//		}
//		System.out.println("\n"+ maxRowIndex +"th Index is having maximum elements");
//		System.out.println("no of elements -> "+maxElements);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size: ");
		int row=sc.nextInt();
		int a[][]= new int[row][];
		for(int i=0;i<row;i++) {
			System.out.println("Enter the columns for the row: "+(i+1)+" :");
			a[i]=new int[sc.nextInt()];
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter the element for "+i+" "+j+" index");
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("class "+ (i+1) +" Scored markes "+a[i][j]);
			}
		}
		
	}

}
