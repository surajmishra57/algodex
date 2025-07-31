package org.example.prefix_sum.meduim_hard;

import java.util.HashMap;

/**
 * Count Subarrays having Sum K
 * Last Updated : 28 Jul, 2025
 * Given an array arr[] of postive and negative integers, the objective is to find the number of subarrays having a sum exactly equal to a given number k.
 * <p>
 * Examples:
 * <p>
 * Input : arr[] = [10, 2, -2, -20, 10], k = -10
 * Output : 3
 * Explanation: Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum equal to -10.
 * <p>
 * Input : arr[] = [9, 4, 20, 3, 10, 5], k = 33
 * Output : 2
 * Explanation: Subarrays: arr[0...2], arr[2...4] have sum equal to 33.
 * <p>
 * Input : arr[] = [1, 3, 5], k = 2
 * Output : 0
 * Explanation: No subarrays with 0 sum.
 */
public class Q13 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(countSubArraysHavingSumK(arr, k));
        System.out.println(countSubArraysHavingSumKUsingPrefixArrayAndHashMap(arr, k));
    }

    private static int countSubArraysHavingSumKUsingPrefixArrayAndHashMap(int[] arr, int k) {
        int count = 0;
//        int[] prefixSum = new int[arr.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum == k)
                count++;
            if (map.containsKey(currentSum - k))
                count += map.get(currentSum - k);
            else {
                map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
            }
        }

        return count;

    }

    private static int countSubArraysHavingSumK(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}
