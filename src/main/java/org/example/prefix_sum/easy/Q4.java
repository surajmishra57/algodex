package org.example.prefix_sum.easy;

/**
 * Original Array from given Prefix Sums
 * Last Updated : 18 Mar, 2025
 * You are given a prefix sum array presum[] of an array arr[]. The task is to find the original array arr[] whose prefix sum is presum[].
 * <p>
 * Examples:
 * <p>
 * Input:  presum[] = {5, 7, 10, 11, 18}
 * Output: [5, 2, 3, 1, 7]
 * Explanation: Original array {5, 2, 3, 1, 7}
 * Prefix sum array = {5, 5+2, 5+2+3, 5+2+3+1, 5+2+3+1+7} = {5, 7, 10, 11, 18}
 * Each element of original array is replaced by the sum of the prefix of current index.
 * <p>
 * Input: presum[] = {45, 57, 63, 78, 89, 97}
 * Output: [45, 12, 6, 15, 11, 8]
 * <p>
 * The problem can be solved using the following observation:
 * <p>
 * Given a prefix sum array presum[] and the original array arr[] of size n, the prefix sum array is calculated as:
 * <p>
 * presum[0] = arr[0]
 * presum[i] = arr[0] + arr[1] + ... + arr[i] for all i in the range [1, N-1]
 * This means: presum[i] = presum[i-1] + arr[i]. Hence, the original array elements can be calculated as:
 * <p>
 * arr[0] = presum[0]
 * For all i in the range [1, n-1], arr[i] = presum[i] - presum[i-1]
 * Steps to Solve:
 * <p>
 * Traverse the presum[] array starting from the beginning.
 * If the index i = 0, then arr[i] = presum[i].
 * Else, for all i > 0, arr[i] = presum[i] - presum[i-1].
 */
public class Q4 {
    public static void main(String[] args) {
        int[] presum = new int[]{45, 57, 63, 78, 89, 97};
        for (int x : findOrignalArray(presum)) {
            System.out.print(x + " ");
        }
    }

    private static int[] findOrignalArray(int[] presum) {
        int[] res = new int[presum.length];
        res[0] = presum[0];
        for (int i = 1; i < presum.length; i++) {
            res[i] = presum[i] - presum[i - 1];
        }
        return res;
    }
}
