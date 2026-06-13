package com.project;

public class DifferenceMaxMin {
	public static int differenceMaxMin(int[] arr) {
      
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 2, 7, 1};
        System.out.println(differenceMaxMin(arr1)); 

        int[] arr2 = {10, 5, 3, 20};
        System.out.println(differenceMaxMin(arr2)); 

        int[] arr3 = {9, 9, 9};
        System.out.println(differenceMaxMin(arr3));
    }
}
