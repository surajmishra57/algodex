package org.example.array.easy;

import java.util.HashSet;

/**
 * Duplicate within K Distance in an Array
 * Last Updated : 04 Feb, 2025
 * Given an integer array arr[] and an integer k, determine whether there exist two indices i and j such that arr[i] == arr[j] and |i - j| ≤ k. If such a pair exists, return 'Yes', otherwise return 'No'.
 * <p>
 * Examples:
 * <p>
 * Input: k = 3, arr[] = [1, 2, 3, 4, 1, 2, 3, 4]
 * Output: No
 * Explanation: Each element in the given array arr[] appears twice and the distance between every element and its duplicate is 4.
 * <p>
 * Input: k = 3, arr[] = [1, 2, 3, 1, 4, 5]
 * Output: Yes
 * Explanation: 1 is present at index 0 and 3.
 * <p>
 * Input: k = 3, arr[] = [1, 2, 3, 4, 5]
 * Output: No
 * Explanation: There is no duplicate element in arr[].
 */
public class Q2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int k = 3;
        System.out.println(duplicateWithInKDistanceUsingHashSet(arr, k));
        System.out.println("======================");
        System.out.println(duplicateWithInKDistanceUsingNestedLoop(arr, k));
    }

    private static boolean duplicateWithInKDistanceUsingNestedLoop(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; (j <= k && (i + j < arr.length)); j++) {
                int t = i + j;
                if (arr[i] == arr[t])
                    return true;
            }
        }
        return false;
    }


    private static boolean duplicateWithInKDistanceUsingHashSet(int[] arr, int k) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashSet.contains(arr[i]))
                return true;
            hashSet.add(arr[i]);
            if (i >= k) {
                hashSet.remove(arr[i - k]);
            }
        }
        return false;
    }
}
