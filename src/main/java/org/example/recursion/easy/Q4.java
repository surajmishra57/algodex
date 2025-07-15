package org.example.recursion.easy;

/**
 * https://www.geeksforgeeks.org/dsa/sum-array-elements-using-recursion/
 * Sum of array elements using recursion
 * Last Updated : 17 Mar, 2025
 * Given an array of integers, find sum of array elements using recursion.
 * <p>
 * Examples:
 * <p>
 * Input: arr = [1, 2, 3]
 * Output: 6
 * Explanation: 1 + 2 + 3 = 6
 * <p>
 * Input: arr = [15, 12, 13, 10]
 * Output: 50
 * Explanation: 15 + 12 + 13 + 10 = 50
 */
public class Q4 {
    public static void main(String[] args) {
        int[] arr = new int[]{15, 12, 13, 10};
        System.out.println(findTheSumOfArrayUsingRecursion(arr, 0));
    }

    private static int findTheSumOfArrayUsingRecursion(int[] arr, int index) {
        if (index >= arr.length - 1)
            return arr[arr.length - 1];
        return arr[index] + findTheSumOfArrayUsingRecursion(arr, index + 1);
    }
}
