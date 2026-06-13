package com.ProblemSolvinginclass;

public class Pattern {

	public static void main(String[] args) {
		int n=4;
	
		
		
//		Square
//		do {
//			int j=0;
//			do {
//				System.out.print("* ");
//				j++;
//			}while(j<n);
//			i++;
//			System.out.println();
//		}while(i<n);
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1) {
				System.out.print("* ");
				}
				else {
				System.out.print("  ");	
				}
			}
			System.out.println();
		}
		
		
	}

}
