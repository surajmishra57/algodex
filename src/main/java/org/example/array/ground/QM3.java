package org.example.array.ground;

import java.util.ArrayList;

/**
 * Subarray with Given Sum
 * Last Updated : 30 Dec, 2024
 * Given a 1-based indexing array arr[] of non-negative integers and an integer sum. You mainly need to return the left and right indexes(1-based indexing) of that subarray. In case of multiple subarrays, return the subarray indexes which come first on moving from left to right. If no such subarray exists return an array consisting of element -1.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [15, 2, 4, 8, 9, 5, 10, 23], target = 23
 * Output: [2, 5]
 * Explanation: Sum of subarray arr[2...5] is 2 + 4 + 8 + 9 = 23.
 * <p>
 * Input: arr[] = [1, 10, 4, 0, 3, 5], target = 7
 * Output: [3, 5]
 * Explanation: Sum of subarray arr[3...5] is 4 + 0 + 3 = 7.
 * <p>
 * Input: arr[] = [1, 4], target = 0
 * Output: [-1]
 * Explanation: There is no subarray with 0 sum.
 */
public class QM3 {
    public static void main(String[] args) {
        int[] arr = new int[]{15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        System.out.println(findSubArrayWithGivenSum(arr, target));
    }

    private static ArrayList<Integer> findSubArrayWithGivenSum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int left = 0, right = 0, sum = 0;
        while (right < arr.length) {
            sum += arr[right];
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                res.add(left + 1);
                res.add(right + 1);
                return res;
            }
            right++;
        }
        return res;
    }
}
