package org.example.array.basics;

/**
 * Largest element in an Array
 * Last Updated : 27 Dec, 2024
 * Given an array arr. The task is to find the largest element in the given array.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [10, 20, 4]
 * Output: 20
 * Explanation: Among 10, 20 and 4, 20 is the largest.
 * <p>
 * Input: arr[] = [20, 10, 20, 4, 100]
 * Output: 100
 */
public class Q3 {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 10, 20, 4, 100};
        System.out.println(largestElementUsingIteration(arr));
        System.out.println("");
        System.out.println(largestElementUsingRecursion(arr, 0, Integer.MIN_VALUE));
    }

    private static int largestElementUsingRecursion(int[] arr, int index, int maxValue) {
        if (index >= arr.length)
            return maxValue;
        return Math.max(maxValue, largestElementUsingRecursion(arr, index + 1, arr[index]));
    }

    private static int largestElementUsingIteration(int[] arr) {
        int maxEle = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxEle < arr[i])
                maxEle = arr[i];
        }
        return maxEle;
    }

}
