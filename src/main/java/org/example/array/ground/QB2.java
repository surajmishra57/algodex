package org.example.array.ground;

/**
 * Check if an Array is Sorted
 * Last Updated : 15 Jul, 2025
 * Given an array arr[], check if it is sorted in ascending order or not. Equal values are allowed in an array and two consecutive equal values are considered sorted.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [10, 20, 30, 40, 50]
 * Output: true
 * Explanation: The given array is sorted.
 * <p>
 * Input: arr[] = [90, 80, 100, 70, 40, 30]
 * Output: false
 * Explanation: The given array is not sorted.
 */
public class QB2 {
    public static void main(String[] args) {
        int[] arr = new int[]{90, 80, 100, 70, 40, 30};
        System.out.println(uisngIterativeMethod(arr));
        System.out.println(usingRecursionApproch(arr, 1));
    }

    private static boolean usingRecursionApproch(int[] arr, int i) {
        if (i >= arr.length - 1)
            return true;
        if (arr[i] < arr[i - 1])
            return false;
        return usingRecursionApproch(arr, i + 1);


    }

    private static boolean uisngIterativeMethod(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }
}
