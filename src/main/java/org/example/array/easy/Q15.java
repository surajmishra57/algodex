package org.example.array.easy;

/**
 * Maximum Subarray Sum - Kadane's Algorithm
 * Last Updated : 09 Jul, 2025
 * Given an integer array arr[], find the subarray (containing at least one element) which has the maximum possible sum, and return that sum.
 * Note: A subarray is a continuous part of an array.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
 * Output: 11
 * Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.
 * <p>
 * Input: arr[] = [-2, -4]
 * Output: -2
 * Explanation: The subarray [-2] has the largest sum -2.
 * <p>
 * Input: arr[] = [5, 4, 1, 7, 8]
 * Output: 25
 * Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.
 */
public class Q15 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 1, 7, 8};
        System.out.println(usingKadanesAlgo(arr));
        System.out.println(usingAllSubSet(arr));
    }

    private static int usingAllSubSet(int[] arr) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                temp += arr[j];
                result = Math.max(result, temp);
            }
        }
        return result;
    }

    private static int usingKadanesAlgo(int[] arr) {
        int result = arr[0];
        int maxvalue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxvalue = Math.max(maxvalue + arr[i], arr[i]);
            result = Math.max(result, maxvalue);
        }
        return result;
    }
}
