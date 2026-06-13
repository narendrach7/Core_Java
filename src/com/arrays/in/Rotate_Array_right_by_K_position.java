package com.arrays.in;

import java.util.Arrays;

public class Rotate_Array_right_by_K_position {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int n = arr.length;
        // Handle case where k > n
        k = k % n;
        System.out.print("Before Rotation: ");
        System.out.println(Arrays.toString(arr));
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        System.out.print("After Rotation:  ");
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp  = arr[start];
            arr[start] = arr[end];
            arr[end]  = temp;
            start++;
            end--;
        }
    }
}
