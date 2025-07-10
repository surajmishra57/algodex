package org.example.array.basics;

/**
 * Alternate elements of an array
 * Last Updated : 04 Dec, 2024
 * Given an array arr[], the task is to print every alternate element of the array starting from the first element.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [10, 20, 30, 40, 50]
 * Output: 10 30 50
 * Explanation: Print the first element (10), skip the second element (20), print the third element (30), skip the fourth element(40) and print the fifth element(50).
 * <p>
 * Input: arr[] = [-5, 1, 4, 2, 12]
 * Output: -5 4 12
 * <p>
 * Try it on GfG Practice
 */
public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        usingIteration(arr);
        System.out.println("");
        usingRecursion(arr, 0);
    }

    private static void usingRecursion(int[] arr, int index) {
        if (index <= arr.length) {
            System.out.print(arr[index] + " ");
            usingRecursion(arr, index + 2);
        }
    }

    private static void usingIteration(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
