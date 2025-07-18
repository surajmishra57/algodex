package org.example.array.ground;

/**
 * Maximum Circular Subarray Sum
 * Last Updated : 26 Jun, 2025
 * Given a circular array arr[], find the maximum sum of any non-empty subarray. A circular array allows wrapping from the end back to the beginning.
 * Note: A subarray can span from the end of the array and continue at the beginning.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
 * Output: 22
 * Explanation: The circular subarray [12, 8, -8, 9, -9, 10] gives the maximum sum, which is 22.
 * <p>
 * Input: arr[] = [4, -1, -2, 3]
 * Output: 7
 * Explanation: The circular subarray [3, 4] gives the maximum sum of 7.
 * <p>
 * Input: arr[] = [5, -2, 3, 4]
 * Output: 12
 * Explanation: The circular subarray [3, 4, 5] gives the maximum sum of 12.
 */
public class QM5 {
    public static void main(String[] args) {
        int[] arr = new int[]{8, -8, 9, -9, 10, -11, 12};
        System.out.println(findMaximumSubArraySumCircular(arr));
    }

    private static int findMaximumSubArraySumCircular(int[] arr) {
        int maxSoFar = arr[0];
        int result = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            maxSoFar = Math.max(maxSoFar + arr[i], arr[i]);
            result = Math.max(result, maxSoFar);
        }
        return result;
    }
}
