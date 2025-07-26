package org.example.array_revision;

/**
 * Given a circular array arr[], find the maximum sum of any non-empty subarray. A circular array allows wrapping from the end back to the beginning.
 * Note: A subarray may wrap around the end and continue from the beginning, forming a circular segment.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
 * Output: 22
 * Explanation: The circular subarray [12, 8, -8, 9, -9, 10] gives the maximum sum, which is 22.
 * <p>
 * Input: arr[] = [4, -1, -2, 3]
 * Output: 7
 * Explanation: The circular subarray [3, 4] gives the maximum sum of 7.
 * <p>
 * Input: arr[] = [5, -2, 3, 4]
 * Output: 12
 * Explanation: The circular subarray [3, 4, 5] gives the maximum sum of 12.
 */

public class MaximumCircularSubArraySum {
    public static void main(String[] args) {
        int[] nums = new int[]{5, -2, 3, 4};
        System.out.println(circularSubArraySumUsingKdansAlgo(nums));
    }

    private static int circularSubArraySumUsingKdansAlgo(int[] nums) {
        int maxSum = nums[0], maxSoFar = 0;
        int minSum = nums[0], minSoFar = 0;
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            maxSoFar = Math.max(maxSoFar + nums[i], nums[i]);
            maxSum = Math.max(maxSoFar, maxSum);

            minSoFar = Math.min(minSoFar + nums[i], nums[i]);
            minSum = Math.min(minSoFar, minSum);

            totalSum += nums[i];
        }
        int normalSum = maxSum;
        int circularSum = totalSum - minSum;
        if (totalSum == minSum)
            return normalSum;
        return Math.max(normalSum, circularSum);
    }
}
