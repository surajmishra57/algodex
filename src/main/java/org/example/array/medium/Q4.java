package org.example.array.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * https://www.geeksforgeeks.org/dsa/minimum-number-swaps-required-sort-array/
 * Minimum swaps to sort an array
 * Last Updated : 14 Jan, 2025
 * Given an array arr[] of distinct elements, find the minimum number of swaps required to sort the array.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [2, 8, 5, 4]
 * Output: 1
 * Explanation: Swap 8 with 4 to get the sorted array.
 * <p>
 * Input: arr[] = [10, 19, 6, 3, 5]
 * Output: 2
 * Explanation: Swap 10 with 3 and 19 with 5 to get the sorted array.
 * <p>
 * Input: arr[] = [1, 3, 4, 5, 6]
 * Output: 0
 * Explanation: Input array is already sorted.
 */
public class Q4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5, 6};
        System.out.println(minimumNumberOfSwapRequiredToSort(arr));
    }

    private static int minimumNumberOfSwapRequiredToSort(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int swapCount = 0;
        int[] cloneArr = arr.clone();
        Arrays.sort(cloneArr);
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != cloneArr[i]) {
                int index = map.get(cloneArr[i]);
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                swapCount++;
                map.put(arr[i], index);
                map.put(arr[index], i);
            }
        }
        return swapCount;
    }
}
