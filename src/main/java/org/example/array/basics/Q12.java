package org.example.array.basics;

/**
 * Move all zeros to end of array
 * Last Updated : 18 Feb, 2025
 * Given an array of integers arr[], the task is to move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
 * Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
 * Explanation: There are three 0s that are moved to the end.
 * <p>
 * Input: arr[] = [10, 20, 30]
 * Output: arr[] = [10, 20, 30]
 * Explanation: No change in array as there are no 0s.
 * <p>
 * Input: arr[] = [0, 0]
 * Output: arr[] = [0, 0]
 * Explanation: No change in array as there are all 0s.
 */
public class Q12 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 0, 4, 3, 0, 5, 0};
        moveAllZeroToEnd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        moveAllZeroToFront(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void moveAllZeroToFront(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
    }

    private static void moveAllZeroToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
    }
}
