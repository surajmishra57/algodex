package org.example.array.ground;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 4 Sum - All Distinct Quadruplets with given Sum in an Array
 * Last Updated : 08 Jan, 2025
 * Given an array arr[], and an integer target, find all possible unique quadruplets in an array whose sum is equal to the given target value. We can return quadruplets in any order, but all the quadruplets should be internally sorted, i.e., for any quadruplets [q1, q2, q3, q4] the following should follow: q1 <= q2 <= q3 <= q4.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [10, 11, 10, 12, 11], target = 43
 * Output: [[10, 10, 11, 12]]
 * Explanation: The quadruplets are:
 * [10, 11, 10, 12], sum = 10 + 11 + 10 +12 = 43
 * [10, 11, 10, 11], sum = 10 + 11 + 10 + 11 = 42
 * [10, 11, 12, 11], sum = 10 + 11 + 12 + 11 = 44
 * [10, 10, 12, 11], sum = 10 + 10 + 12 + 11 = 43
 * [11, 10, 12, 11], sum = 11 + 10 + 12 + 11 = 44
 * When arranged in sorted order, there is only one distinct quadruplet with sum = 43, that is [10, 10, 11, 12]
 * <p>
 * Input: arr[] = [10, 2, 3, 4, 5, 7, 8], target = 23
 * Output: [[2, 3, 8, 10], [2, 4, 7, 10], [3, 5, 7, 8]]
 * Explanation: There are only three distinct quadruplets with sum = 23.
 * <p>
 * Input: arr[] = [1, 1, 1, 1, 1, 1], target = 4
 * Output: [[1, 1, 1, 1]]
 */
public class QH12 {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5, 7, 8};
        int target = 23;
        System.out.println(findALlDistinctQuadrupletsWithGiveSum(arr, target));
    }

    private static ArrayList<ArrayList<Integer>> findALlDistinctQuadrupletsWithGiveSum(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                int left = j + 1, right = arr.length - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target) {
                        ArrayList<Integer> r = new ArrayList<>();
                        r.add(arr[i]);
                        r.add(arr[j]);
                        r.add(arr[left]);
                        r.add(arr[right]);
                        res.add(r);
                        right--;
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }

                }
            }
        }
        return res;
    }
}
