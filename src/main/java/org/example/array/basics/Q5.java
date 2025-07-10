package org.example.array.basics;

import java.util.ArrayList;

/**
 * Largest three distinct elements in an array
 * Last Updated : 05 Jun, 2025
 * Given an array arr[], the task is to find the top three largest distinct integers present in the array.
 * <p>
 * Note: If there are less than three distinct elements in the array, then return the available distinct numbers in descending order.
 * <p>
 * Examples :
 * <p>
 * Input: arr[] = [10, 4, 3, 50, 23, 90]
 * Output: [90, 50, 23]
 * <p>
 * Input: arr[] = [10, 9, 9]
 * Output: [10, 9]
 * There are only two distinct elements
 * <p>
 * Input: arr[] = [10, 10, 10]
 * Output: [10]
 * There is only one distinct element
 * <p>
 * Input: arr[] = []
 * Output: []
 */

public class Q5 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 4, 3, 50, 23, 90};
        ArrayList<Integer> res = findThreeLargestUsingIteration(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> findThreeLargestUsingIteration(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int first = Integer.MIN_VALUE, sec = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = sec;
                sec = first;
                first = arr[i];
            } else if (arr[i] > sec && arr[i] != first) {
                third = sec;
                sec = arr[i];
            } else if (arr[i] > third && arr[i] != sec && arr[i] != first) {
                third = arr[i];
            }

        }
        res.add(first);
        res.add(sec);
        res.add(third);
        return res;
    }
}
