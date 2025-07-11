package org.example.array.easy;

/**
 * Sum of all Subarrays
 * Last Updated : 27 Jun, 2025
 * Given an integer array arr[], find the sum of all sub-arrays of the given array.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 4, 5, 3, 2]
 * Output: 116
 * Explanation: Sum of all possible subarrays of the array [1, 4, 5, 3, 2] is 116..
 * <p>
 * Input: arr[] = [1, 2, 3, 4]
 * Output: 50
 * Explanation: Sum of all possible subarrays of the array [1, 2, 3, 4] is 50.
 * <p>
 * Try it on GfG Practice
 */
public class Q4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 3, 2};
        System.out.println(sumOfAllSubArrayUsingFormula(arr));
        System.out.println(sumOfAllSubArrayUsingNestedLoop(arr));
    }

    private static int sumOfAllSubArrayUsingNestedLoop(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                temp += arr[j];
                result += temp;
            }
        }
        return result;
    }

    private static int sumOfAllSubArrayUsingFormula(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] * (i + 1) * (arr.length - i);
        }
        return result;
    }
}
