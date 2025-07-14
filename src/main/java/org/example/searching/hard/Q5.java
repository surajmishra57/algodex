package org.example.searching.hard;

import java.util.HashMap;
import java.util.HashSet;

/**
 * https://www.geeksforgeeks.org/dsa/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/
 * Pair Sum in a Sorted and Rotated Array
 * Last Updated : 25 Feb, 2025
 * Given an array arr[] of size n, which is sorted and then rotated around an unknown pivot, the task is to check whether there exists a pair of elements in the array whose sum is equal to a given target value.
 * <p>
 * Examples :
 * <p>
 * Input: arr[] = [11, 15, 6, 8, 9, 10], target = 16
 * Output: true
 * Explanation: There is a pair (6, 10) with sum 16.
 * <p>
 * Input: arr[] = [11, 11, 15, 26, 38, 9, 10], target = 35
 * Output: true
 * Explanation: There is a pair (26, 9) with sum 35.
 * <p>
 * Input: arr[] = [9, 10, 10, 11, 15, 26, 38], target = 45
 * Output: false
 * Explanation: There is no pair with sum 45.
 * <p>
 * Try it on GfG Practice
 */
public class Q5 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 15, 6, 8, 9, 10};
        int target = 16;

        System.out.println(findPairInSortedAndRotatedArray(arr, target));
        System.out.println(findPairInSortedAndRotatedArrayUsingTwoPointer(arr, target));
    }

    private static boolean findPairInSortedAndRotatedArrayUsingTwoPointer(int[] arr, int target) {
        int i, low = 0, high = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1])
                break;
        }
        low = (i + 1) % arr.length;
        high = i;
        while (low != high) {
            if (arr[low] + arr[high] == target)
                return true;
            else if (arr[low] + arr[high] > target) {
                high = (high - 1 + arr.length) % arr.length;
            } else {
                low = (low + 1) % arr.length;
            }

        }
        return false;
    }

    private static boolean findPairInSortedAndRotatedArray(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if (set.contains(val))
                return true;
            set.add(arr[i]);
        }
        return false;
    }
}
