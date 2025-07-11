package org.example.array.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Intersection of Two Sorted Arrays
 * Last Updated : 11 Oct, 2024
 * Given two sorted arrays a[] and b[], the task is to return intersection. Intersection of two arrays is said to be elements that are common in both arrays. The intersection should not count duplicate elements and the result should contain items in sorted order.
 * <p>
 * Examples:
 * <p>
 * Input: a[] = {1, 1, 2, 2, 2, 4}, b[] = {2, 2, 4, 4}
 * Output: {2, 4}
 * Explanation: 2 and 4 are only common elements in both the arrays.
 * <p>
 * Input: a[] = {1, 2}, b[] = {3, 4}
 * Output: {}
 * Explanation: No common elements.
 * <p>
 * Input: a[] = {1, 2, 3}, b[] = {1, 2, 3}
 * Output: {1, 2, 3}
 * Explanation: All elements are common
 */
public class Q25 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 2, 2, 2, 4};
        int[] b = new int[]{2, 2, 4, 4};
//        ArrayList<Integer> res = usingTowNestedLoop(a, b);
        ArrayList<Integer> res = usingHashSet(a, b);
        for (var x : res) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> usingHashSet(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i]))
                res.add(b[i]);
        }
        return new ArrayList<>(res);
    }

    private static ArrayList<Integer> usingTowNestedLoop(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])
                    set.add(a[i]);
            }
        }
        return new ArrayList<>(set);
    }


}
