package org.example.sliding_window.easy;

/**
 * Find maximum (or minimum) sum of a subarray of size k
 * Last Updated : 05 Aug, 2024
 * Given an array of integers and a number k, find the maximum sum of a subarray of size k.
 * <p>
 * Examples:
 * <p>
 * Input  : arr[] = {100, 200, 300, 400},  k = 2
 * Output : 700
 * <p>
 * Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
 * Output : 39
 * Explanation: We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.
 * <p>
 * Input  : arr[] = {2, 3}, k = 3
 * Output : Invalid
 * Explanation: There is no subarray of size 3 as size of whole array is 2.
 * <p>
 * Try it on GfG Practice
 */
public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(findMaximumSumOfSubArraySizeK(arr, k));
    }

    private static int findMaximumSumOfSubArraySizeK(int[] arr, int k) {
        int i;
        int result = Integer.MIN_VALUE;
        int sum = 0;
        for (i = 0; i < k; i++) {
            sum += arr[i];
        }
        result = Math.max(result, sum);
        for (i = k; i < arr.length; i++) {
            sum = (sum + arr[i]) - arr[i - k];
            result = Math.max(result, sum);
        }
        return result;
    }
}
