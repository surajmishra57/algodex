package org.example.array.ground;

/**
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
public class QM4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 45, 6, 0, 19};
        int target = 31;
        System.out.println(findSmallestSubArrayWithSumGraterThanTarget(arr, target));
    }

    private static int findSmallestSubArrayWithSumGraterThanTarget(int[] arr, int target) {
        int left = 0, right = 0, sum = 0;
        int res = Integer.MIN_VALUE;
        while (right < arr.length) {
            sum += arr[right];
            while (sum > target && left < right) {
                sum -= arr[left];
                res = Math.max(res, right - left + 1);
                left++;
            }
            right++;
        }
        return res;
    }
}
