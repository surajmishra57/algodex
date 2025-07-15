package org.example.searching.medium;

/**
 * https://www.geeksforgeeks.org/dsa/find-minimum-element-in-a-sorted-and-rotated-array/
 * <p>
 * Minimum in a Sorted and Rotated Array
 * Last Updated : 13 Dec, 2024
 * Given a sorted array of distinct elements arr[] of size n that is rotated at some unknown point, the task is to find the minimum element in it.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [5, 6, 1, 2, 3, 4]
 * Output: 1
 * Explanation: 1 is the minimum element present in the array.
 * <p>
 * Input: arr[] = [3, 1, 2]
 * Output: 1
 * Explanation: 1 is the minimum element present in the array.
 * <p>
 * Input: arr[] = [4, 2, 3]
 * Output: 2
 * Explanation: 2 is the only minimum element in the array.
 */
public class Q5B {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 1, 2, 3, 4};
        System.out.println(findMinValueInSortedAndRotatedArrayUsingBinarySearch(arr));
    }

    private static int findMinValueInSortedAndRotatedArrayUsingBinarySearch(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[left] < arr[right])
                return arr[left];

            else if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        return arr[left];
    }
}
