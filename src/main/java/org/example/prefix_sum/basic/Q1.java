package org.example.prefix_sum.basic;

/**
 * Prefix Sum Array - Implementation
 * Last Updated : 13 Jul, 2025
 * Given an array arr[], Find the prefix sum of the array. A prefix sum array is another array prefixSum[] of the same size, such that prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [10, 20, 10, 5, 15]
 * Output: [10, 30, 40, 45, 60]
 * Explanation: For each index i, add all the elements from 0 to i:
 * prefixSum[0] = 10,
 * prefixSum[1] = 10 + 20 = 30,
 * prefixSum[2] = 10 + 20 + 10 = 40 and so on.
 * <p>
 * Input: arr[] = [30, 10, 10, 5, 50]
 * Output: [30, 40, 50, 55, 105]
 * Explanation: For each index i, add all the elements from 0 to i:
 * prefixSum[0] = 30,
 * prefixSum[1] = 30 + 10 = 40,
 * prefixSum[2] = 30 + 10+ 10 = 50 and so on.
 */
public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 10, 5, 15};
        for (int x : genratePrefixSumArray(arr)) {
            System.out.print(x + " ");
        }
    }

    private static int[] genratePrefixSumArray(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
}
