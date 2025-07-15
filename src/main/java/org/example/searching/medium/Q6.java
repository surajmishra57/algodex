package org.example.searching.medium;

/**
 * https://www.geeksforgeeks.org/dsa/find-a-peak-in-a-given-array/
 * Peak Element in Array
 * Last Updated : 27 Feb, 2025
 * Given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak element if it is strictly greater than its adjacent elements. If there are multiple peak elements, return the index of any one of them.
 * <p>
 * Note: Consider the element before the first element and the element after the last element to be negative infinity.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 2, 4, 5, 7, 8, 3]
 * Output: 5
 * Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].
 * <p>
 * Input: arr[] = [10, 20, 15, 2, 23, 90, 80]
 * Output: 1 or 5
 * Explanation: arr[1] = 20 and arr[5] = 90 are peak elements because arr[0] < arr[1] > arr[2] and arr[4] < arr[5] > arr[6].
 * <p>
 * Input: arr[] = [1, 2, 3]
 * Output: 2
 * Explanation: arr[2] is a peak element because arr[1] < arr[2] and arr[2] is the last element, so it has negative infinity to its right.
 */
public class Q6 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 7, 8, 3};
        System.out.println(findingPeakElementUsingLinearSearch(arr));
        System.out.println(findPeakElementUisngBinarySearch(arr));
    }

    private static int findPeakElementUisngBinarySearch(int[] arr) {
        if (arr[0] > arr[1])
            return arr[0];
        if (arr[arr.length - 1] > arr[arr.length - 2])
            return arr[arr.length - 1];

        int low = 1, high = arr.length - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                return arr[mid];
            if (arr[mid] < arr[mid + 1])
                low = mid + 1;
            else
                high = mid - 1;

        }
        return -1;
    }

    private static int findingPeakElementUsingLinearSearch(int[] arr) {
        if (arr[0] > arr[1])
            return arr[0];
        if (arr[arr.length - 1] > arr[arr.length - 2])
            return arr[arr.length - 1];

        for (int i = 1; i <= arr.length - 2; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                return arr[i];
        }
        return -1;
    }
}
