package org.example.array.medium;

import java.util.PriorityQueue;

/**
 * https://www.geeksforgeeks.org/dsa/nearly-sorted-algorithm/
 * Sort a nearly sorted (or K sorted) array
 * Last Updated : 11 Feb, 2025
 * Given an array arr[] and a number k . The array is sorted in a way that every element is at max k distance away from it sorted position. It means if we completely sort the array, then the index of the element can go from i - k to i + k where i is index in the given array. Our task is to completely sort the array.
 * <p>
 * Examples:
 * <p>
 * Input: arr= [6, 5, 3, 2, 8, 10, 9], k = 3
 * Output: [2, 3, 5, 6, 8, 9, 10]
 * <p>
 * Input: arr[]= [1, 4, 5, 2, 3, 6, 7, 8, 9, 10], k = 2
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */
public class Q5 {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        sortUsingPriorityQueue(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sortUsingPriorityQueue(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            queue.add(arr[i]);
        }
        int i;
        for (i = k; i < arr.length; i++) {
            queue.add(arr[i]);
            arr[i - k] = queue.poll();
        }
        while (!queue.isEmpty()) {
            arr[i - k] = queue.poll();
            i++;
        }
    }
}
