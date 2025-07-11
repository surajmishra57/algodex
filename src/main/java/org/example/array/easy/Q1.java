package org.example.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Find all distinct elements in a given array
 * Last Updated : 07 Jul, 2025
 * Given an integer array arr[], find all the distinct elements of the given array. The given array may contain duplicates and the output should contain every element only once.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [2, 2, 3, 3, 7, 5]
 * Output: [2, 3, 7, 5]
 * Explanation : After removing the duplicates 2 and 3 we get 2 3 7 5.
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5]
 * Output: [1, 2, 3, 4, 5]
 * Explanation : There doesn't exists any duplicate element.
 */
public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 3, 3, 7, 5};
//        ArrayList<Integer> res = removeDuplicateUsingHashSetMethod(arr);
//        ArrayList<Integer> res = removeDuplicateUsingNestedLoopMethod(arr);
//        ArrayList<Integer> res = removeDuplicateUsingSortingMethod(arr);
//        for (var x : res) {
//            System.out.print(x + " ");
//        }
//        System.out.println("================");
        int count = removeDuplicateInSameArray(arr);
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicateInSameArray(int[] arr) {
        int count = 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[count++] = arr[i];
            }
        }
        return count;
    }

    private static ArrayList<Integer> removeDuplicateUsingSortingMethod(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1])
                res.add(arr[i]);
        }
        return res;
    }

    private static ArrayList<Integer> removeDuplicateUsingNestedLoopMethod(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            for (; j <= i; j++) {
                if (arr[j] == arr[i])
                    break;
            }
            if (j == i)
                res.add(arr[i]);
        }
        return res;
    }

    private static ArrayList<Integer> removeDuplicateUsingHashSetMethod(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        return new ArrayList<>(hashSet);
    }
}
