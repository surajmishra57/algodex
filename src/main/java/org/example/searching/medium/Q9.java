package org.example.searching.medium;

/**
 * https://www.geeksforgeeks.org/dsa/find-k-closest-elements-given-value/
 * Closest K Elements in a Sorted Array
 * Last Updated : 11 Jun, 2025
 * You are given a sorted array arr[] containing unique integers, a number k, and a target value x. Your goal is to return exactly k elements from the array that are closest to x, excluding x itself if it is present in the array.
 * <p>
 * An element a is closer to x than b if:
 * <p>
 * |a - x| < |b - x|, or
 * |a - x| == |b - x| and a > b (i.e., prefer the larger element if tied)
 * Examples:
 * <p>
 * Input: arr[] = [12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56], k = 4, x = 35
 * Output: 39 30 42 45
 * Explanation: First closest element to 35 is 39.
 * Second closest element to 35 is 30.
 * Third closest element to 35 is 42.
 * And fourth closest element to 35 is 45.
 * <p>
 * Input: arr[] = [1, 3, 4, 10, 12], k = 2, x = 4
 * Output: 3 1
 * Explanation: 4 is excluded, Closest elements to 4 are: 3 (1), 1 (3). So, the 2 closest elements are: 3 1
 */
public class Q9 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
        int k = 4;
        int x = 35;
        for (var t : findColsestKElementsUsingLinearSearch(arr, k, x)) {
            System.out.print(t + " ");
        }
    }

    private static int[] findColsestKElementsUsingLinearSearch(int[] arr, int k, int x) {
        int[] result = new int[k];
        int count = 0;
        int i = 0;
        while (i < arr.length && arr[i] < x) {
            i++;
        }
        int left = i - 1, right = i;
        if (right < arr.length && arr[right] == x)
            right++;
        while (left >= 0 && right < arr.length - 1 && count < k) {
            int leftDiff = Math.abs(arr[left] - x);
            int rightDiff = Math.abs(arr[right] - x);
            if (leftDiff < rightDiff) {
                result[count++] = arr[left];
                left--;
            } else {
                result[count++] = arr[right];
                right++;
            }

        }
        while (left >= 0 && count < k) {
            result[count++] = arr[left--];
        }
        while (right < arr.length - 1 && count < k) {
            result[count++] = arr[right++];
        }

        return result;
    }
}
