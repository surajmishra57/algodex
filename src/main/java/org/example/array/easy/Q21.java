package org.example.array.easy;

import java.util.Arrays;

/**
 * Chocolate Distribution Problem
 * Last Updated : 25 Feb, 2025
 * Given an array arr[] of n integers where arr[i] represents the number of chocolates in ith packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:
 * <p>
 * Each student gets exactly one packet.
 * The difference between the maximum and minimum number of chocolates in the packets given to the students is minimized.
 * Examples:
 * <p>
 * Input: arr[] = {7, 3, 2, 4, 9, 12, 56}, m = 3
 * Output: 2
 * Explanation: If we distribute chocolate packets {3, 2, 4}, we will get the minimum difference, that is 2.
 * <p>
 * Input: arr[] = {7, 3, 2, 4, 9, 12, 56}, m = 5
 * Output: 7
 * Explanation: If we distribute chocolate packets {3, 2, 4, 9, 7}, we will get the minimum difference, that is 9 - 2 = 7.
 */
public class Q21 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 2, 4, 9, 12, 56};
        int m = 5;
        System.out.println(chocolateDistributionUsingSlidingWindow(arr, m));
    }

    private static int chocolateDistributionUsingSlidingWindow(int[] arr, int m) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = m; i < arr.length; i++) {
            result = Math.min(result, (arr[i - 1] - arr[i - m]));
        }
        return result;
    }
}
