package org.example.array.basics;

import java.util.Collections;

/**
 * Array Reverse - Complete Tutorial
 * Last Updated : 25 Sep, 2024
 * Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = {1, 4, 3, 2, 6, 5}
 * Output: {5, 6, 2, 3, 4, 1}
 * Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.
 * <p>
 * Input: arr[] = {4, 5, 1, 2}
 * Output: {2, 1, 5, 4}
 * Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
 */
public class Q10 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, 2, 6, 5};
//        reverseArrayUsingExtraSpace(arr);
//        reverseArrayUsingTwoPointer(arr);
//        reverseArrayUsingRecursion(arr, 0, arr.length - 1);
        reverseArrayUsingHalfWay(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

    }

    private static void reverseArrayUsingHalfWay(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    private static void reverseArrayUsingRecursion(int[] arr, int left, int right) {
        if (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            reverseArrayUsingRecursion(arr, left + 1, right - 1);
        }
    }

    private static void reverseArrayUsingTwoPointer(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    private static void reverseArrayUsingExtraSpace(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[arr.length - i - 1] = arr[i];
        }
        for (int i = 0; i < res.length; i++) {
            arr[i] = res[i];
        }
    }
}
