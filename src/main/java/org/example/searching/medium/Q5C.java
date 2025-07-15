package org.example.searching.medium;

/**
 * Maximum element in a sorted and rotated array
 * Last Updated : 11 Jul, 2025
 * Given a sorted array arr[] (may contain duplicates) of size n that is rotated at some unknown point, the task is to find the maximum element in it.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = {5, 6, 1, 2, 3, 4}
 * Output: 6
 * Explanation: 6 is the maximum element present in the array.
 * <p>
 * Input: arr[] = {3, 2, 2, 2}
 * Output: 3
 * Explanation: 3 is the maximum element present in the array.
 */
public class Q5C {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 1, 2, 3, 4};
        System.out.println(findMaximumInSortedAndRotatedArrayUsingBinarySearch(arr));
    }

    private static int findMaximumInSortedAndRotatedArrayUsingBinarySearch(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            if (arr[low] <= arr[high])
                return arr[high];
            int mid = (low + high) / 2;
            if (arr[mid] > arr[low])
                low = mid;
            else {
                high = mid - 1;
            }
        }
        return arr[low];
    }
}
