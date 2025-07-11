package org.example.array.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Unique Number I
 * Last Updated : 21 Apr, 2025
 * Given an array of integers, every element in the array appears twice except for one element which appears only once. The task is to identify and return the element that occurs only once.
 * <p>
 * Examples:
 * <p>
 * Input:  arr[] = [2, 3, 5, 4, 5, 3, 4]
 * Output: 2
 * Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.
 * <p>
 * Input: arr[] = [2, 2, 5, 5, 20, 30, 30]
 * Output: 20
 * Explanation: Since 20 occurs once, while other numbers occur twice, 20 is the answer.
 */
public class Q6 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 5, 5, 20, 30, 30};
        System.out.println(findUniqueNumberUsingHashMap(arr));
        System.out.println(findUniqueNumberUsingXorOperator(arr));
    }


    private static int findUniqueNumberUsingXorOperator(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }

    private static int findUniqueNumberUsingHashMap(int[] arr) {
        int result = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (var m : map.entrySet()) {
            if (m.getValue() == 1) {
                return m.getKey();
            }
        }
        return result;
    }
}
