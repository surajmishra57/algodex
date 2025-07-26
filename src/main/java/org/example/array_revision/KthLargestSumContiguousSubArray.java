package org.example.array_revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
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
public class KthLargestSumContiguousSubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{20, -5, -1};
        int k = 3;
        System.out.println(KthLargestSumContiguousSubArrayUsingSorting(arr, k));
        System.out.println(KthLargestSumContiguousSubArrayUsingMaxHeap(arr, k));
    }

    private static int KthLargestSumContiguousSubArrayUsingMaxHeap(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                maxHeap.add(sum);
            }
        }
        for (int i = 1; i < k; i++) {
            maxHeap.poll();
        }
        return maxHeap.peek();
    }

    private static int KthLargestSumContiguousSubArrayUsingSorting(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            res.add(arr[i]);
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                res.add(sum);
            }
        }
        res.sort((a, b) -> b - a);
//        res.sort(Collections.reverseOrder());
        return res.get(k - 1);
    }
}
