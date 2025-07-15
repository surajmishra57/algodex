package org.example.searching.medium;

import java.util.PriorityQueue;

/**
 * https://www.geeksforgeeks.org/dsa/kth-smallest-largest-element-in-unsorted-array/
 * <p>
 * K’th Smallest Element in Unsorted Array
 * Last Updated : 14 Aug, 2024
 * Given an array arr[] of N distinct elements and a number K, where K is smaller than the size of the array. Find the K'th smallest element in the given array.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3
 * Output: 7
 * <p>
 * Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4
 * Output: 10
 */
public class Q4 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(findKthSmallestElementInUnsortedArray(arr, k));

    }

    private static int findKthSmallestElementInUnsortedArray(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            if (queue.size() > k)
                queue.poll();
        }
        return queue.peek();
    }
}
