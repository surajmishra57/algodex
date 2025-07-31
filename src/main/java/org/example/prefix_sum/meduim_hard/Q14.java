package org.example.prefix_sum.meduim_hard;

/**
 * Smallest sum contiguous subarray
 * Last Updated : 07 Mar, 2025
 * Given an array containing n integers. The problem is to find the sum of the elements of the contiguous subarray having the smallest(minimum) sum.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = {3, -4, 2, -3, -1, 7, -5}
 * Output: -6
 * Explanation: Subarray with minimum sum is {-4, 2, -3, -1} = -6
 * <p>
 * Input: arr = {2, 6, 8, 1, 4}
 * Output: 1
 * Explanation: Subarray with minimum sum is {1} = 1
 */
public class Q14 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, -4, 2, -3, -1, 7, -5};
        System.out.println(findSmallestSumContigousArray(nums));
        System.out.println(findSmallestSumContigousArrayUsingKadansAlgo(nums));
    }

    private static int findSmallestSumContigousArrayUsingKadansAlgo(int[] nums) {
        int minSoFar = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            minSoFar = Math.min(minSoFar + nums[i], nums[i]);
            result = Math.min(result, minSoFar);
        }
        return result;
    }


    private static int findSmallestSumContigousArray(int[] nums) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                result = Math.min(result, sum);
            }
        }
        return result;
    }
}
