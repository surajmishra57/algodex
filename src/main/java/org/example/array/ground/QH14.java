package org.example.array.ground;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 4 Sum - Quadruplet Sum Closest to Target
 * Last Updated : 15 Oct, 2024
 * Given an array arr[] of n integers and an integer target, the task is to find a quadruplet in arr[] whose sum is closest to target.
 * <p>
 * Note: There may be multiple quadruplets with sum closest to the target, return any one of them.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = {4, 5, 3, 4, 1, 2}, target = 13
 * Output: {4, 5, 3, 1}
 * Explanation:
 * Sum of quadruplets:
 * 4 + 5 + 3 + 4 = 16
 * 4 + 5 + 3 + 1 = 13
 * 4 + 5 + 3 + 2 = 14
 * 5 + 3 + 4 + 4 = 16
 * ....
 * Quadruplet having sum 13 is closest to the target.
 * <p>
 * Input: arr[] = {1, 2, 3, 4, 10}, target = 20
 * Output: {1, 3, 5, 10}
 * Explanation:
 * Sum of quadruplets:
 * 1 + 2 + 3 + 4 = 10
 * 1 + 2 + 3 + 10 = 16
 * 2 + 3 + 4 + 10 = 19
 * 1 + 3 + 4  + 10 = 18
 * ...
 * Quadruplet having sum 19 is closest to the target.
 */
public class QH14 {
    public static void main(String[] args) {
//        int[] arr = {4, 5, 3, 4, 1, 2};
//        int target = 13;
//        System.out.println(findQuadrupletHavingSumTarget(arr, target));
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 1;
        System.out.println(threeSumClosest(arr, target));
    }

    private static ArrayList<Integer> findQuadrupletHavingSumTarget(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                int left = j + 1, right = arr.length - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    int diff = Math.abs(sum - target);
                    if (diff < minDiff) {
                        minDiff = diff;
                        res.clear();
                        res.add(arr[i]);
                        res.add(arr[j]);
                        res.add(arr[left]);
                        res.add(arr[right]);
                    }
                    if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }

                }
            }
        }

        return res;
    }


    public static int threeSumClosest(int[] nums, int target) {
        int sum = -1;
        int result = -1;
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];
                int currDiff = Math.abs(target - sum);
                if (minDiff > currDiff) {
                    minDiff = currDiff;
                    result = sum;
                }
                if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }

        }
        return result;
    }
}
