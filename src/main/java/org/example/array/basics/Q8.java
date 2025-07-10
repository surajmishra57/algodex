package org.example.array.basics;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Remove duplicates from Sorted Array
 * Last Updated : 19 Nov, 2024
 * Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order. Additionally, return the length of this distinct sorted subarray.
 * <p>
 * Note: The elements after the distinct ones can be in any order and hold any value, as they don't affect the result.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [2, 2, 2, 2, 2]
 * Output: [2]
 * Explanation: All the elements are 2, So only keep one instance of 2.
 * <p>
 * Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
 * Output: [1, 2, 3, 4, 5]
 * <p>
 * Input: arr[] = [1, 2, 3]
 * Output: [1, 2, 3]
 * Explanation : No change as all elements are distinct.
 */
public class Q8 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 2, 2, 2};
        ArrayList<Integer> res = removeDuplicateUsingHashSet(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }
        System.out.println();
        int index = removeDuplicateUsingTraversal(arr);
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicateUsingTraversal(int[] arr) {
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                arr[index++] = arr[i];
            }
        }
        return index;

    }

    private static ArrayList<Integer> removeDuplicateUsingHashSet(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        return new ArrayList<>(hashSet);
    }
}
