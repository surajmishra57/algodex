package org.example.searching.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/dsa/given-two-sorted-arrays-number-x-find-pair-whose-sum-closest-x/
 * Find the closest pair from two sorted arrays
 * Last Updated : 20 Oct, 2023
 * Given two arrays arr1[0...m-1] and arr2[0..n-1], and a number x, the task is to find the pair arr1[i] + arr2[j] such that absolute value of (arr1[i] + arr2[j] - x) is minimum.
 * <p>
 * Example:
 * <p>
 * Input:  arr1[] = {1, 4, 5, 7};
 * arr2[] = {10, 20, 30, 40};
 * x = 32
 * Output:  1 and 30
 * Input:  arr1[] = {1, 4, 5, 7};
 * arr2[] = {10, 20, 30, 40};
 * x = 50
 * Output:  7 and 40
 */
public class Q10 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 7};
        int[] arr2 = new int[]{10, 20, 30, 40};
        int x = 32;
        for (var xt : findClosestPairOfTwoSortedArrays(arr, arr2, x)) {
            System.out.print(xt + " ");
        }
    }

    private static List<Integer> findClosestPairOfTwoSortedArrays(int[] arr, int[] arr2, int target) {
        int minDiff = Integer.MAX_VALUE;
        int left = 0, right = arr2.length - 1;
        List<Integer> res = new ArrayList<>();
        while (left < arr.length && right >= 0) {
            int sum = arr[left] + arr2[right];
            if (minDiff > Math.abs(sum - target)) {
                res.clear();
                res.add(arr[left]);
                res.add(arr2[right]);
                minDiff = Math.abs(sum - target);

            } else if (sum > target) {
                right--;
            } else {
                left++;
            }

        }
        return res;
    }
}
