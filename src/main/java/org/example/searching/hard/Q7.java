package org.example.searching.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * https://www.geeksforgeeks.org/dsa/kth-largest-element-in-a-stream/
 * <p>
 * K'th largest element in a stream
 * Last Updated : 11 May, 2025
 * Given an input stream of n integers, represented as an array arr[], and an integer k. After each insertion of an element into the stream, you need to determine the kth largest element so far (considering all elements including duplicates). If k elements have not yet been inserted, return -1 for that insertion. The task is to return an array of size n containing the kth largest element after each insertion step.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5, 6], k = 4
 * Output: -1 -1 -1 1 2 3
 * Explanation: The first three insertions have fewer than 4 elements, so output is -1. From the fourth insertion onward, the kth largest elements are 1, 2, and 3 respectively.
 * <p>
 * Input: arr[] = [10, 20, 5, 15], k = 2
 * Output: -1 10 10 15
 * Explanation: First insertion gives -1 as fewer than 2 elements. After second, 2nd largest is 10. Then still 10. After inserting 15, elements are [10, 20, 5, 15]; 2nd largest is now 15.
 * <p>
 * Input: arr[] = [3, 4], k = 1
 * Output: 3 4
 * Explanation: After each insertion, there is at least 1 element, so the 1st largest elements are 3 and then 4.
 */
public class Q7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 4;
        System.out.println(findKthLargestElementUsingMinHeap(arr, k));
    }

    private static List<Integer> findKthLargestElementUsingMinHeap(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> a - b);
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            res.add((queue.size() < k) ? -1 : queue.poll());
        }
        return res;
    }
}
