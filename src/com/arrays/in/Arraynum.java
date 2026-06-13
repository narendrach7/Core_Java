package com.arrays.in;

import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class Arraynum {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		
		try {
			BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the size fo array: ");
			int n=Integer.parseInt(sc.readLine());
			int [] nums=new int[n];
			for(int i=0;i<nums.length;i++) {
				int s=Integer.parseInt(sc.readLine());
				nums[i]=n;
			}
			System.out.println(Arrays.toString(nums));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
