package org.example.sliding_window.easy;

/**
 * Maximum sum subarray having sum less than or equal to given sum
 * Last Updated : 05 Mar, 2025
 * You are given an array of non-negative integers and a target sum. Your task is to find a contiguous subarray whose sum is the maximum possible, while ensuring that it does not exceed the given target sum.
 * <p>
 * Note: The given array contains only non-negative integers.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5], sum = 11
 * Output: 10
 * Explanation: Subarray having maximum sum is [1, 2, 3, 4]
 * <p>
 * <p>
 * Input: arr[] = [2, 4, 6, 8, 10], sum = 7
 * Output: 6
 * Explanation: Subarray having maximum sum is [2, 4]or [6]
 * <p>
 * Try it on GfG Practice
 */
public class Q6 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 6, 8, 10};
        int sum = 7;
        System.out.println(findSubArrayWithMaximumSum(nums, sum));
    }

    private static int findSubArrayWithMaximumSum(int[] nums, int sum) {
        int left = 0, right = 0, currentSum = 0, result = Integer.MIN_VALUE;
        while (right < nums.length) {
            currentSum += nums[right];
            while (currentSum >= sum) {
                currentSum -= nums[left];
                left++;
            }
            result = Math.max(result, currentSum);
            right++;
        }
        return result;
    }

}
