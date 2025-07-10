package org.example.array.basics;

/**
 * Second Largest Element in an Array
 * Last Updated : 10 Feb, 2025
 * Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.
 * <p>
 * Note: If the second largest element does not exist, return -1.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [12, 35, 1, 10, 34, 1]
 * Output: 34
 * Explanation: The largest element of the array is 35 and the second largest element is 34.
 * <p>
 * Input: arr[] = [10, 5, 10]
 * Output: 5
 * Explanation: The largest element of the array is 10 and the second largest element is 5.
 * <p>
 * Input: arr[] = [10, 10, 10]
 * Output: -1
 * Explanation: The largest element of the array is 10 there is no second largest element.
 */
public class Q4 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 35, 1, 10, 34, 1};
        System.out.println(secondLargestInArrayUsingIteration(arr));
        System.out.println("");
        System.out.println(secondLargestInArrayUsingRecursion(arr, Integer.MIN_VALUE, Integer.MIN_VALUE, 0));
    }

    private static int secondLargestInArrayUsingRecursion(int[] arr, int first, int second, int index) {
        if (arr.length <= index)
            return second;
        if (arr[index] > first) {
            second = first;
            first = arr[index];
        } else if (arr[index] > second && arr[index] != first) {
            second = arr[index];
        }
        return secondLargestInArrayUsingRecursion(arr, first, second, index + 1);
    }

    private static int secondLargestInArrayUsingIteration(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second;
    }
}
