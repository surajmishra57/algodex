package org.example.array.ground;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 2 Sum - Find All Pairs With Given Sum
 * Last Updated : 11 Oct, 2024
 * Given an array arr[] and a target value, the task is to find all possible indices (i, j) of pairs (arr[i], arr[j]) whose sum is equal to target and i != j. We can return pairs in any order, but all the returned pairs should be internally sorted, that is for any pair(i, j), i should be less than j.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = {10, 20, 30, 20, 10, 30}, target = 50
 * Output: {{1, 2}, {1, 5}, {2, 3}, {3, 5}}
 * Explanation: All pairs with sum = 50 are:
 * <p>
 * arr[1] + arr[2] = 20 + 30 = 50
 * arr[1] + arr[5] = 20 + 30 = 50
 * arr[2] + arr[3] = 30 + 20 = 50
 * arr[3] + arr[5] = 20 + 30 = 50
 * Input: arr[] =  {10, 20, 30, 20, 10, 30}, target = 80
 * Output: { }
 * Explanation: No pairs have sum = 80.
 */
public class QM8 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 10, 30};
        int target = 50;
        System.out.println(findAllPairWithGivenSum(arr, target));
    }

    private static ArrayList<ArrayList<Integer>> findAllPairWithGivenSum(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if (map.containsKey(val)) {
                for (var p : map.get(val)) {
                    ArrayList<Integer> r = new ArrayList<>();
                    r.add(i);
                    r.add(p);
                    res.add(r);
                }
            }
            if (!map.containsKey(arr[i]))
                map.put(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);

        }
        return res;
    }
}
