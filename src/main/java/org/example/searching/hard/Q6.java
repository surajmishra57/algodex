package org.example.searching.hard;

import java.util.PriorityQueue;

/**
 * https://www.geeksforgeeks.org/dsa/kth-smallest-largest-element-in-unsorted-array-worst-case-linear-time/
 * <p>
 * K’th Smallest/Largest Element in Unsorted Array | Worst case Linear Time
 * Last Updated : 10 May, 2025
 * Given an array of distinct integers arr[] and an integer k. The task is to find the k-th smallest element in the array. For better understanding, k refers to the element that would appear in the k-th position if the array were sorted in ascending order.
 * Note: k will always be less than the size of the array.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
 * Output: 7
 * Explanation: The sorted array is [3, 4, 7, 10, 15, 20]. The 3rd smallest element is 7.
 * <p>
 * Input: arr[] = [12, 3, 5, 7, 19], k = 2
 * Output: 5
 * Explanation: The sorted array is [3, 5, 7, 12, 19]. The 2nd smallest element is 5.
 * <p>
 * Input: arr[] = [1, 5, 2, 8, 3], k = 4
 * Output: 5
 */
public class Q6 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(findkthSmallestElementForUnsortedArray(arr, k));
    }

    private static int findkthSmallestElementForUnsortedArray(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            if (queue.size() > k)
                queue.poll();
        }
        return queue.peek();
    }
}
