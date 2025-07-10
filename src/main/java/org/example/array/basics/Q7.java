package org.example.array.basics;

/**
 * Check if an Array is Sorted
 * Last Updated : 13 May, 2025
 * Given an array of size n, the task is to check if it is sorted in ascending order or not. Equal values are allowed in an array and two consecutive equal values are considered sorted.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [20, 21, 45, 89, 89, 90]
 * Output: Yes
 * <p>
 * Input: arr[] = [20, 20, 45, 89, 89, 90]
 * Output: Yes
 * <p>
 * Input: arr[] = [20, 20, 78, 98, 99, 97]
 * Output: No
 */
public class Q7 {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 20, 78, 98, 99, 97};
        System.out.println(checkUsingIterationApproach(arr));
        System.out.println();
        System.out.println(checkUsingRecursionApproch(arr, 1));
    }

    private static boolean checkUsingRecursionApproch(int[] arr, int index) {
        if (arr.length <= index)
            return true;
        if (arr[index - 1] > arr[index])
            return false;
        return checkUsingRecursionApproch(arr, index + 1);
    }

    private static boolean checkUsingIterationApproach(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i])
                return false;
        }
        return true;
    }
}
