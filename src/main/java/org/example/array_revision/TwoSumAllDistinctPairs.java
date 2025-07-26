package org.example.array_revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 2 Sum – All distinct pairs with given sum
 * Last Updated : 11 Jul, 2025
 * Given an array arr[] of size n and an integer target, the task is to find all distinct pairs in the array whose sum is equal to target. We can return pairs in any order, but all the returned pairs should be internally sorted, i.e., for any pair [q1, q2] the following should follow: q1 <= q2 .
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = {1, 5, 7, -1, 5}, target= 6
 * Output: {{1, 5}, {-1, 7}}
 * Explanation: There are only two pairs that add up to 6: {1, 5} and {-1, 7}.
 * <p>
 * Input: arr[] = {1, 9, -1, 8, 6}, target = 4
 * Output: {{}}
 * Explanation: No pairs add up to 4.
 */
public class TwoSumAllDistinctPairs {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 5, 7, -1, 5};
        int target = 6;
        System.out.println(findAllDistinctPairsTwoSum(arr, target));
        System.out.println(findAllDistinctPairsUsingTowPointer(arr, target));
    }

    private static List<List<Integer>> findAllDistinctPairsUsingTowPointer(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (left > 0 && arr[left] == arr[left - 1]) {
                left++;
                continue;
            }
            if (right < arr.length - 1 && arr[right] == arr[right + 1]) {
                right++;
                continue;
            }
            int result = arr[left] + arr[right];
            if (result == target) {
                res.add(Arrays.asList(arr[left], arr[right]));
                left++;
                right--;
            } else if (result > target) {
                right--;
            } else {
                left++;
            }
        }
        return res;
    }

    private static List<List<Integer>> findAllDistinctPairsTwoSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if (map.containsKey(val)) {
                int first = Math.min(map.get(val), arr[i]);
                int second = Math.max(map.get(val), arr[i]);
                if (!result.contains(Arrays.asList(first, second)))
                    result.add(Arrays.asList(first, second));
            }
            map.put(arr[i], arr[i]);
        }
        return result;
    }
}
