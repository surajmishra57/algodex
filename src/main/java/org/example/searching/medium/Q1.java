package org.example.searching.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/dsa/find-triplets-array-whose-sum-equal-zero/
 * 3 Sum - Find All Triplets with Zero Sum
 * Last Updated : 14 Feb, 2025
 * Given an array arr[], the task is to find all possible indices {i, j, k} of triplet {arr[i], arr[j], arr[k]} such that their sum is equal to zero and all indices in a triplet should be distinct (i != j, j != k, k != i). We need to return indices of a triplet in sorted order, i.e., i < j < k.
 * <p>
 * Examples :
 * <p>
 * Input: arr[] = {0, -1, 2, -3, 1}
 * Output: {{0, 1, 4}, {2, 3, 4}}
 * Explanation:  Two triplets with sum 0 are:
 * arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0
 * arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0
 * <p>
 * Input: arr[] = {1, -2, 1, 0, 5}
 * Output: {{0, 1, 2}}
 * Explanation: Only triplet which satisfies the condition is arr[0] + arr[1] + arr[2] = 1 + (-2) + 1 = 0
 * <p>
 * Input: arr[] = {2, 3, 1, 0, 5}
 * Output: {{}}
 * Explanation: There is no triplet with sum 0
 */
public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, -1, 2, -3, 1};
        System.out.println(findTripleatesWithSumZero(arr));
    }


    private static ArrayList<ArrayList<Integer>> findTripleatesWithSumZero(int[] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        ArrayList<Integer> r = new ArrayList<>();
                        r.add(i);
                        r.add(j);
                        r.add(k);
                        res.add(r);
                    }
                }
            }
        }
        return res;
    }
}
