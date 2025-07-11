package org.example.array.medium;

import java.util.ArrayList;
import java.util.Collections;

/**
 * https://www.geeksforgeeks.org/dsa/k-th-largest-sum-contiguous-subarray/
 * K-th Largest Sum Contiguous Subarray
 * Last Updated : 08 May, 2025
 * Given an array arr[] of size n, the task is to find the kth largest sum of contiguous subarray within the array of numbers that has both negative and positive numbers.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [20, -5, -1], k = 3
 * Output: 14
 * Explanation: All sum of contiguous subarrays are (20, 15, 14, -5, -6, -1), so the 3rd largest sum is 14.
 * <p>
 * Input: arr[] = [10, -10, 20, -40], k = 6
 * Output: -10
 * Explanation: The 6th largest sum among sum of all contiguous subarrays is -10.
 */
public class Q7 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, -10, 20, -40};
        int k = 6;
        System.out.println(largestSumContiguousSubarray(arr, k));
    }

    private static int largestSumContiguousSubarray(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                temp += arr[j];
                res.add(temp);
            }
        }
        res.sort(Collections.reverseOrder());
        return res.get(k - 1);
    }
}
