package com.Matrix.in;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row and columns: ");
		int rows=sc.nextInt();
		int columns = sc.nextInt();
		int arr[][] = new int[rows][columns];
		int transpose[][]=new int[columns][rows];
		System.out.println("Enter the array values: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				transpose[j][i]=arr[i][j];
			}
		}
		
		System.out.println("\nprinting the transpose matrix");
		
		for(int i=0;i<columns;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
