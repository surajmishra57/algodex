package org.example.array_revision;

/**
 * Find the smallest missing number
 * Last Updated : 23 Jul, 2025
 * Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n. Find the smallest number that is missing from the array.
 * <p>
 * Examples:
 * <p>
 * Input: {0, 1, 2, 6, 9}, n = 5, m = 10
 * Output: 3
 * <p>
 * Input: {4, 5, 10, 11}, n = 4, m = 12
 * Output: 0
 * <p>
 * Input: {0, 1, 2, 3}, n = 4, m = 5
 * Output: 4
 * <p>
 * Input: {0, 1, 2, 3, 4, 5, 6, 7, 10}, n = 9, m = 11
 * Output: 8
 */
public class findMissingSmallestElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 10};
        System.out.println(findUsingBinarySearch(arr));
    }

    private static int findUsingBinarySearch(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            if (arr[left] != left)
                return left;
            int mid = (left + right) / 2;

            if (arr[mid] == mid)
                left = mid + 1;
            else
                right = mid;

            if (left == right && left != arr[right])
                return left;
        }

        return right + 1;

    }
}
