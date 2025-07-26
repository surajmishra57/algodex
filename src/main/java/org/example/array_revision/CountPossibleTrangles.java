package org.example.array_revision;

import java.util.Arrays;

/**
 * Count Possible Triangles
 * Last Updated : 23 Jul, 2025
 * Given an unsorted array of positive integers, the task is to find the number of triangles that can be formed with three different array elements as three sides of triangles.
 * <p>
 * For a triangle to be possible from 3 values as sides, the sum of the two values (or sides) must always be greater than the third value (or third side).
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [4, 6, 3, 7]
 * Output: 3
 * Explanation: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7].
 * Note that [3, 4, 7] is not a possible triangle.
 * <p>
 * Input: arr[] = [10, 21, 22, 100, 101, 200, 300]
 * Output: 6
 * Explanation: There can be 6 possible triangles:
 * [10, 21, 22], [21, 100, 101], [22, 100, 101], [10, 100, 101], [100, 101, 200] and [101, 200, 300]
 * <p>
 * Input: arr[] = [1, 2, 3]
 * Output: 0
 * Examples: No triangles are possible.
 */
public class CountPossibleTrangles {
    public static void main(String[] args) {
        int[] nums = new int[]{10, 21, 22, 100, 101, 200, 300};
        System.out.println(countPossibleNumberOfTrangles(nums));
        System.out.println(countPossibleNumberOfTrangelsUsingPointers(nums));
    }

    private static int countPossibleNumberOfTrangelsUsingPointers(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 2; i < nums.length; i++) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }

    private static int countPossibleNumberOfTrangles(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] > nums[k] && nums[k] + nums[j] > nums[i] && nums[i] + nums[k] > nums[j])
                        count++;
                }
            }
        }

        return count;
    }
}

