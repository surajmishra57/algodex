package org.example.prefix_sum.meduim_hard;

import java.util.HashMap;

/**
 * Longest Subarray With Sum K
 * Last Updated : 11 Jan, 2025
 * Given an array arr[] of size n containing integers, the task is to find the length of the longest subarray having sum equal to the given value k.
 * <p>
 * Note: If there is no subarray with sum equal to k, return 0.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
 * Output: 6
 * Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.
 * <p>
 * Input: arr[] = [-5, 8, -14, 2, 4, 12], k = -5
 * Output: 5
 * Explanation: Only subarray with sum = 15 is [-5, 8, -14, 2, 4] of length 5.
 * <p>
 * Input: arr[] = [10, -10, 20, 30], k = 5
 * Output: 0
 * Explanation: No subarray with sum = 5 is present in arr[].
 */
public class Q2 {
    public static void main(String[] args) {
        int[] nums = new int[]{10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubArrayWithSumK(nums, k));
        System.out.println(longestSubArrayWithSumKUsingHashMap(nums, k));
    }

    private static int longestSubArrayWithSumKUsingHashMap(int[] nums, int k) {
        int result = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k)
                result = i + 1;
            if (map.containsKey(sum - k)) {
                result = Math.max(result, i - map.get(sum - k));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

        }

        return result;
    }


    private static int longestSubArrayWithSumK(int[] nums, int k) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    result = Math.max(result, j - i + 1);
                }
            }
        }

        return result;
    }
}
