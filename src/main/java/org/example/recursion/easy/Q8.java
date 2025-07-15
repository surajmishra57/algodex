package org.example.recursion.easy;

/**
 * https://www.geeksforgeeks.org/dsa/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
 * Recursive Programs to find Minimum and Maximum elements of array
 * Last Updated : 05 Jul, 2025
 * Given an array of integers arr[], the task is to find the minimum and maximum elements in the array using recursion only.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 4, 3, -5, -4, 8, 6]
 * Output: min = -5, max = 8
 * <p>
 * Input: arr[] = [1, 4, 45, 6, 10, -8]
 * Output: min = -8, max = 45
 * <p>
 * Input: arr[] = [12, 3, 15, 7, 9]
 * Output: min = 3, max = 15
 */
public class Q8 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, -5, -4, 8, 6};
        System.out.println("min value : " + findMinValue(arr, 0));
        System.out.println("max value : " + findMaxValue(arr, 0));
    }

    private static int findMaxValue(int[] arr, int i) {
        if (i >= arr.length - 1)
            return arr[i];
        return Math.max(arr[i], findMaxValue(arr, i + 1));
    }

    private static int findMinValue(int[] arr, int i) {
        if (i >= arr.length - 1)
            return arr[arr.length - 1];
        return Math.min(arr[i], findMinValue(arr, i + 1));
    }
}
