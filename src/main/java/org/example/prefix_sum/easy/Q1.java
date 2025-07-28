package org.example.prefix_sum.easy;

/**
 * Equilibrium Index
 * Last Updated : 23 Jul, 2025
 * Given an array arr[] of size n, the task is to return an equilibrium index (if any) or -1 if no equilibrium index exists. The equilibrium index of an array is an index such that the sum of all elements at lower indexes equals the sum of all elements at higher indexes.
 * <p>
 * Note: When the index is at the start of the array, the left sum is 0, and when it's at the end, the right sum is 0.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 2, 0, 3]
 * Output: 2
 * Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.
 * <p>
 * Input: arr[] = [1, 1, 1, 1]
 * Output: -1
 * Explanation: There is no equilibrium index in the array.
 * <p>
 * Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
 * Output: 3
 * Explanation: The sum of left of index 3 is -7 + 1 + 5 = -1 and sum on right of index 3 is -4 + 3 + 0 = -1.
 */
public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 0, 3};
        System.out.println(findEquilibrium(arr));
        System.out.println(findEquilibriumOptimized(arr));
    }

    private static int findEquilibriumOptimized(int[] arr) {
        int total = 0, prefix = 0, suffix;
        for (int x : arr) {
            total += x;
        }
        for (int i = 0; i < arr.length; i++) {
            suffix = total - prefix - arr[i];
            if (prefix == suffix) {
                return arr[i];
            }
            prefix += arr[i];
        }
        return -1;
    }

    private static int findEquilibrium(int[] arr) {
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        suffix[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (suffix[i] == prefix[i])
                return arr[i];
        }
        return -1;
    }
}
