package org.example.array_revision;

/**
 * Smallest subarray with sum greater than a given value
 * Last Updated : 23 Jul, 2025
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
public class SmallestSubArrayGreaterThenGivenSum {
    public static void main(String[] args) {
        int x = 51;
        int[] arr = new int[]{1, 10, 5, 2, 7};
        System.out.println(findSmallestSubArrayGraterThenGivenSum(arr, x));
    }

    private static int findSmallestSubArrayGraterThenGivenSum(int[] arr, int x) {
        int res = Integer.MAX_VALUE;
        int right = 0, left = 0, sum = 0;
        while (right < arr.length) {
            sum += arr[right];
            while (sum > x && left < right) {
                res = Math.min(res, right - left + 1);
                sum -= arr[left];
                left++;
            }
            right++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
