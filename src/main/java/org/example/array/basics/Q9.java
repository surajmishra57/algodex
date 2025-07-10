package org.example.array.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Generating All Subarrays
 * Last Updated : 07 Feb, 2025
 * Given an array arr[], the task is to generate all the possible subarrays of the given array.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 2, 3]
 * Output: [ [1], [1, 2], [2], [1, 2, 3], [2, 3], [3] ]
 * <p>
 * Input: arr[] = [1, 2]
 * Output: [ [1], [1, 2], [2] ]
 */
public class Q9 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        genrateAllSubArray(arr);
        System.out.println("++++++++++++++++++++++++++++");
        genrateAllSubArrayUsingRecursion(arr, 0, 0);

    }

    private static void genrateAllSubArrayUsingRecursion(int[] arr, int start, int end) {
        if (end == arr.length)
            return;
        else if (start > end) {
            genrateAllSubArrayUsingRecursion(arr, 0, end + 1);
        } else {
            for (int s = start; s <= end; s++) {
                System.out.print(arr[s] + " ");
            }
            System.out.println();
            genrateAllSubArrayUsingRecursion(arr, start + 1, end);
        }
    }

    private static void genrateAllSubArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ", ");
                }
                System.out.println("");
            }
        }
    }
}
