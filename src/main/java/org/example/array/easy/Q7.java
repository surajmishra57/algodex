package org.example.array.easy;

/**
 * Find the Missing Number
 * Last Updated : 19 Apr, 2025
 * Given an array arr[] of size n-1 with distinct integers in the range of [1, n]. This array represents a permutation of the integers from 1 to n with one element missing. Find the missing element in the array.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
 * Output: 6
 * Explanation: All the numbers from 1 to 8 are present except 6.
 * <p>
 * Input: arr[] = [1, 2, 3, 5]
 * Output: 4
 * Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4
 */
public class Q7 {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 2, 4, 5, 3, 7, 1};
        System.out.println(findingMissingNumberUsingFormula(arr));
        System.out.println(findingMissingNumberUsingXOR(arr));

    }

    private static int findingMissingNumberUsingXOR(int[] arr) {
        int res1 = 0, res2 = 0;
        for (int i = 0; i < arr.length; i++) {
            res2 ^= arr[i];
        }
        for (int i = 1; i <= arr.length + 1; i++) {
            res1 ^= i;
        }
        return res1 ^ res2;
    }

    private static int findingMissingNumberUsingFormula(int[] arr) {
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        return sum - arraySum;
    }
}
