package org.example.searching.hard;

/**
 * https://www.geeksforgeeks.org/dsa/search-almost-sorted-array/
 * Search in an almost sorted array
 * Last Updated : 05 May, 2025
 * Given a sorted integer array arr[] consisting of distinct elements, where some elements of the array are moved to either of the adjacent positions, i.e. arr[i] may be present at arr[i-1] or arr[i+1].
 * Given an integer target.  You have to return the index ( 0-based ) of the target in the array. If target is not present return -1.
 * <p>
 * Examples :
 * <p>
 * Input: arr[] =  [10, 3, 40, 20, 50, 80, 70], target = 40
 * Output: 2
 * Explanation: Output is index of 40 in given array i.e. 2
 * <p>
 * Input: arr[] =  [10, 3, 40, 20, 50, 80, 70], target = 90
 * Output: -1
 * Explanation: 90 is not present in the array.
 */
public class Q3 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 3, 40, 20, 50, 80, 70};
        int target = 40;
        System.out.println(findIndexOfTargetUsingLinearSearch(arr, target));
        System.out.println(findIndexOfTargetUsingBinarySearch(arr, target));

    }

    private static int findIndexOfTargetUsingBinarySearch(int[] arr, int target) {
        int left = 0, high = arr.length - 1;
        while (left < high) {
            int mid = (left + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (mid > left && arr[mid - 1] == target) {
                return mid - 1;
            } else if (mid < target && arr[mid + 1] == target) {
                return mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 2;
            } else {
                left = mid + 2;
            }
        }
        return -1;
    }

    private static int findIndexOfTargetUsingLinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i])
                return i;

        }
        return -1;
    }
}
