package org.example.array.ground;

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
public class QB1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 5};
        for (var i : removeDuplicatesUsingHashSet(arr))
            System.out.print(i + " ");

        System.out.println();
        int index = removeUsingSameArrayWithIndex(arr);
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Time O(N) Space O(1)
    private static int removeUsingSameArrayWithIndex(int[] arr) {
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1])
                arr[index++] = arr[i];
        }
        return index;
    }

    //Time O(n) Space O(N)
    private static ArrayList<Integer> removeDuplicatesUsingHashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return new ArrayList<>(set);
    }
}
