package org.example.searching.easy;

/**
 * https://www.geeksforgeeks.org/dsa/program-to-find-largest-element-in-an-array/
 * Largest element in an Array
 * Last Updated : 27 Dec, 2024
 * Given an array arr. The task is to find the largest element in the given array.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [10, 20, 4]
 * Output: 20
 * Explanation: Among 10, 20 and 4, 20 is the largest.
 * <p>
 * Input: arr[] = [20, 10, 20, 4, 100]
 * Output: 100
 */
public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 4};
        System.out.println(findLargestUsingLinearSearch(arr));
        System.out.println(findLargestUsingRecursionSearch(arr, 0));
    }

    private static int findLargestUsingRecursionSearch(int[] arr, int index) {
        if (index >= arr.length - 1)
            return arr[index];
        return Math.max(arr[index], findLargestUsingRecursionSearch(arr, index + 1));
    }

    private static int findLargestUsingLinearSearch(int[] arr) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            result = Math.max(arr[i], result);
        }
        return result;
    }
}
