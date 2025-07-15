package org.example.searching.medium;

/**
 * https://www.geeksforgeeks.org/dsa/find-the-element-before-which-all-the-elements-are-smaller-than-it-and-after-which-all-are-greater-than-it/
 * <p>
 * Find the element before which all the elements are smaller than it, and after which all are greater
 * Last Updated : 14 Feb, 2025
 * Given an array, find an element before which all elements are equal or smaller than it, and after which all the elements are equal or greater.
 * <p>
 * Note: Print -1, if no such element exists.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [5, 1, 4, 3, 6, 8, 10, 7, 9]
 * Output: 6
 * Explanation: 6 is present at index 4. All elements on the left of arr[4] are smaller than it and all elements on right are greater.
 * <p>
 * Input: arr[] = [5, 1, 4, 4]
 * Output: -1
 * Explanation: No such element exists.
 */
public class Q2 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 4, 3, 6, 8, 10, 7, 9};
        System.out.println(findPartitionPointUsingNestedLoop(arr));
    }

    private static int findPartitionPointUsingNestedLoop(int[] arr) {
        for (int i = 1; i < arr.length - 2; i++) {
            boolean left = true, right = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    left = false;
                    break;
                }
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    right = false;
                    break;
                }
            }

            if (left && right)
                return arr[i];

        }

        return -1;
    }
}
