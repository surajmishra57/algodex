package org.example.searching.medium;

/**
 * https://www.geeksforgeeks.org/dsa/search-an-element-in-a-sorted-and-pivoted-array/#expected-approach-2-using-single-binary-search-olog-n-time-and-o1-space
 * Search in a Sorted and Rotated Array
 * Last Updated : 07 Dec, 2024
 * Given a sorted and rotated array arr[] of n distinct elements, the task is to find the index of given key in the array. If the key is not present in the array, return -1.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
 * Output: 8
 * Explanation: 3 is present at index 8 in arr[].
 * <p>
 * Input: arr[] = [3, 5, 1, 2], key = 6
 * Output: -1
 * Explanation: 6 is not present in arr[].
 * <p>
 * Input: arr[] = [33, 42, 72, 99], key = 42
 * Output: 1
 * Explanation: 42 is found at index 1.
 * <p>
 * Try it on GfG Practice
 */
public class Q5A {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        System.out.println(findKeyInSortedRotatedArrayUsingBinarySearch(arr, key));
    }

    private static int findKeyInSortedRotatedArrayUsingBinarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] >= arr[left]) {
                if (key >= arr[left] && key < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (key > arr[mid] && key <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
