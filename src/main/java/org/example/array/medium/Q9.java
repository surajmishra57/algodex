package org.example.array.medium;

/**
 * https://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/
 * Smallest subarray with sum greater than a given value
 * Last Updated : 26 Dec, 2024
 * Given an array arr[] of integers and a number x, the task is to find the smallest subarray with a sum strictly greater than x.
 * <p>
 * Examples:
 * <p>
 * Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
 * Output: 3
 * Explanation: Minimum length subarray is [4, 45, 6]
 * <p>
 * Input: x = 100, arr[] = [1, 10, 5, 2, 7]
 * Output: 0
 * Explanation: No subarray exist
 */
public class Q9 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 45, 6, 0, 19};
        int x = 51;
        System.out.println(smallestSubarrayWithSumGraterUsingSlidingWindow(arr, x));
        System.out.println(smallestSubarrayWithSumGraterUsingNestedLoop(arr, x));
    }

    private static int smallestSubarrayWithSumGraterUsingNestedLoop(int[] arr, int x) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > x) {
                    result = Math.min(result, j - i + 1);
                }
            }
        }
        return result;
    }

    private static int smallestSubarrayWithSumGraterUsingSlidingWindow(int[] arr, int x) {
        int left = 0, right = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        while (right < arr.length) {
            sum += arr[right];
            while (sum > x && left < right) {
                sum -= arr[left];
                result = Math.min(result, right - left + 1);
                left++;
            }
            right++;
        }
        return result;
    }
}
