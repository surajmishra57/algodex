package org.example.array.easy;

/**
 * Missing and Repeating in an Array
 * Last Updated : 21 Feb, 2025
 * Given an unsorted array of size n. Array elements are in the range of 1 to n. One number from set {1, 2, ...n} is missing and one number occurs twice in the array. The task is to find these two numbers.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = {3, 1, 3}
 * Output: 3, 2
 * Explanation: In the array, 2 is missing and 3 occurs twice.
 * <p>
 * Input: arr[] = {4, 3, 6, 2, 1, 1}
 * Output: 1, 5
 * Explanation: 5 is missing and 1 is repeating.
 */
public class Q8 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 6, 2, 1, 1};
        findMissingAndRepetingNumber(arr);
    }

    private static void findMissingAndRepetingNumber(int[] arr) {
        int missing = -1, repeating = -1;
        int[] freq = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0)
                missing = i;
            else if (freq[i] == 2) {
                repeating = i;
            }
        }
        System.out.println("Missing : " + missing + " Repeating : " + repeating);
    }
}
