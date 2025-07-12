package org.example.array.medium;

/**
 * https://www.geeksforgeeks.org/dsa/largest-subarray-with-equal-number-of-0s-and-1s/
 * Longest Subarray With Equal Number of 0s and 1s
 * Last Updated : 13 Jan, 2025
 * Given an array arr[] containing only 0s and 1s, find the longest subarray which contains equal no of 0s and 1s.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 0, 1, 1, 1, 0, 0]
 * Output: 6
 * Explanation: arr[1 ... 6] is the longest subarray with three 0s and three 1s.
 * <p>
 * Input: arr[] = [0, 0, 1, 1, 0]
 * Output: 4
 * Explanation: arr[0 ... 3] or  arr[1 ... 4] is the longest subarray with two 0s and two 1s.
 * <p>
 * Input: arr[] = [0]
 * Output: 0
 * Explanation: There is no subarray with an equal number of 0s and 1s.
 */
public class Q13 {
    public static void main(String[] args) {
        int[] arr = new int[]{0};
        System.out.println(equalNumberOfZeroAndOneUsingNestedLoop(arr));
    }

    private static int equalNumberOfZeroAndOneUsingNestedLoop(int[] arr) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int zero = 0, one = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0)
                    zero++;
                if (arr[j] == 1)
                    one++;
                if (zero == one) {
                    maxLength = Math.max(maxLength, (zero + one));
                }
            }
        }
        return maxLength;
    }
}
