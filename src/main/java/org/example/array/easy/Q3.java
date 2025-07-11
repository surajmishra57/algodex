package org.example.array.easy;

import java.util.Arrays;

/**
 * Rearrange array such that even positioned are greater than odd
 * Last Updated : 26 Nov, 2024
 * Given an array arr[], sort the array according to the following relations:
 * <p>
 * arr[i] >= arr[i - 1], if i is even, ∀ 1 <= i < n
 * arr[i] <= arr[i - 1], if i is odd, ∀ 1 <= i < n
 * Find the resultant array.[consider 1-based indexing]
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 2, 2, 1]
 * Output: [1 2 1 2]
 * Explanation:
 * For i = 2, arr[i] >= arr[i-1]. So, 2 >= 1.
 * For i = 3, arr[i] <= arr[i-1]. So, 1 <= 2.
 * For i = 4, arr[i] >= arr[i-1]. So, 2 >= 1.
 * <p>
 * Input: arr[] = [1, 3, 2]
 * Output: [1 3 2]
 * Explanation:
 */
public class Q3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2};
        sortArrayMakeEvenPositionGraterUsingNestedLoop(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    private static void sortArrayMakeEvenPositionGraterUsingNestedLoop(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            if (i > 0 && arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            if (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    private static void sortArrayMakeEvenPositionGraterUsingExteraArray(int[] arr) {
        int[] res = new int[arr.length];
        Arrays.sort(arr);
        int ptr1 = 0, ptr2 = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                res[i] = arr[ptr2--];
            } else if ((i + 1) % 2 != 0) {
                res[i] = arr[ptr1++];
            }
        }
        for (int i = 0; i < res.length; i++) {
            arr[i] = res[i];
        }
    }
}
