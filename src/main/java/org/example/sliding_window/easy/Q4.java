package org.example.sliding_window.easy;

/**
 * Count Strictly Increasing Subarrays
 * Last Updated : 18 Mar, 2025
 * Given an integer array arr[], the task is to count the number of subarrays in arr[] that are strictly increasing and have a size of at least 2. A subarray is a contiguous sequence of elements from arr[]. A subarray is strictly increasing if each element is greater than its previous element.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 4, 5, 3, 7, 9]
 * Output: 6
 * Explanation: The strictly increasing subarrays are: [1, 4], [1, 4, 5], [4, 5], [3, 7], [3, 7, 9], [7, 9]
 * <p>
 * Input: arr[] = [1, 3, 3, 2, 3, 5]
 * Output: 4
 * Explanation: The strictly increasing subarrays are: [1, 3], [2, 3], [2, 3, 5], [3, 5]
 * <p>
 * Input: arr[] = [2, 2, 2, 2]
 * Output: 0
 * Explanation: No strictly increasing subarray exists.
 */
public class Q4 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 5, 3, 7, 9};
        System.out.println(countStrictlyIncresingSubArrayUsingLengthFormula(nums));
        System.out.println(countStrictlyIncresingSubArrayUsingNestedLoop(nums));
    }

    private static int countStrictlyIncresingSubArrayUsingNestedLoop(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j - 1] > nums[j])
                    break;
                count++;
            }
        }
        return count;
    }

    private static int countStrictlyIncresingSubArrayUsingLengthFormula(int[] nums) {
        int count = 0;
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i])
                len++;
            else {
                count += len * (len - 1) / 2;
                len = 1;
            }
        }
        count += len * (len - 1) / 2;
        return count;
    }
}
