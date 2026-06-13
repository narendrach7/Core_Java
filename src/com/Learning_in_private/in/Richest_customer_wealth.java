package com.Learning_in_private.in;

public class Richest_customer_wealth {

	public static void main(String[] args) {
		int accounts[][] = {{1,2,3},{9,7,6},{1,8,9}};
		System.out.println(maximumWealth(accounts));
	}
	public static int maximumWealth(int[][] accounts) {
		int max=0;
		for(int i=0;i<accounts.length;i++) {
			int sum=0;
			for(int j=0;j<accounts[i].length;j++) {
				sum+=accounts[i][j];
			}
			if(sum>max) {
				max=sum;
			}
		}
     return max;
    }

}
