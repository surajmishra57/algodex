package org.example.prefix_sum.meduim_hard;

import java.util.HashMap;
import java.util.Map;

/**
 * Count Subarrays With Sum Divisible By K
 * Last Updated : 15 Jan, 2025
 * Given an array arr[] and an integer k, the task is to count all subarrays whose sum is divisible by k.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [4, 5, 0, -2, -3, 1], k = 5
 * Output: 7
 * Explanation: There are 7 subarrays whose sum is divisible by 5: [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3] and [-2, -3].
 * <p>
 * Input: arr[] = [2, 2, 2, 2, 2, 2], k = 2
 * Output: 21
 * Explanation: All subarray sums are divisible by 2.
 * <p>
 * Input: arr[] = [-1, -3, 2], k = 5
 * Output: 0
 * Explanation: There is no subarray whose sum is divisible by k.
 */
public class Q12 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 2, 2, 2, 2};
        int k = 2;
        System.out.println(countSubArraysWithSumDivisibleByK(nums, k));
        System.out.println(countSubArraysWithSumDivisibleByKUsingPrefixAndHash(nums, k));
    }

    private static int countSubArraysWithSumDivisibleByKUsingPrefixAndHash(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int val = (sum % k + k) % k;
            if (val == 0)
                count++;
            count += map.getOrDefault(val, 0);
            map.put(val, map.getOrDefault(val, 0) + 1);

        }
        return count;
    }

    private static int countSubArraysWithSumDivisibleByK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum % k == 0)
                    count++;
            }
        }
        return count;
    }
}
