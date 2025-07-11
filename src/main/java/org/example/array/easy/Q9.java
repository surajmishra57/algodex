package org.example.array.easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Only Repeating From 1 To n-1
 * Last Updated : 19 Apr, 2025
 * Given an array arr[] of size n filled with numbers from 1 to n-1 in random order. The array has only one repetitive element. The task is to find the repetitive element.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 3, 2, 3, 4]
 * Output: 3
 * Explanation: The number 3 is the only repeating element.
 * <p>
 * Input: arr[] = [1, 5, 1, 2, 3, 4]
 * Output: 1
 * Explanation: The number 1 is the only repeating element.
 */
public class Q9 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 3, 4};
        System.out.println(findOnlyRepeatingUsingNestedLoop(arr));
        System.out.println(findOnlyReaptingUsingSorting(arr));
        System.out.println(findOnlyReaptingUsingHashSet(arr));
        System.out.println(findOnlyReaptingUsingIndexMarking(arr));
    }

    private static int findOnlyReaptingUsingIndexMarking(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i])] < 0)
                return Math.abs(arr[i]);
            arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
        }
        return -1;
    }

    private static int findOnlyReaptingUsingHashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i]))
                return arr[i];
            set.add(arr[i]);
        }
        return -1;
    }

    private static int findOnlyReaptingUsingSorting(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                return arr[i];
        }
        return -1;
    }

    private static int findOnlyRepeatingUsingNestedLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }
}
