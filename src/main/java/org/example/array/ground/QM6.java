package org.example.array.ground;

/**
 * 3 Sum - Triplet Sum Closest to Target
 * Last Updated : 12 Jul, 2025
 * Given an array arr[] of n integers and an integer target, the task is to find the sum of triplets such that the sum is closest to target. Note: If there are multiple sums closest to target, print the maximum one.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [-1, 2, 2, 4], target = 4
 * Output: 5
 * Explanation: All possible triplets
 * <p>
 * [-1, 2, 2], sum = (-1) + 2 + 2 = 3
 * [-1, 2, 4], sum = (-1) + 2 + 4 = 5
 * [-1, 2, 4], sum = (-1) + 2 + 4 = 5
 * [2, 2, 4], sum = 2 + 2 + 4 = 8
 * Triplet [-1, 2, 2], [-1, 2, 4] and [-1, 2, 4] have sum closest to target, so return the maximum one, that is 5.
 * <p>
 * Input: arr[] = [1, 10, 4, 5], target = 10
 * Output: 10
 * Explanation: All possible triplets
 * <p>
 * [1, 10, 4], sum = (1 + 10 + 4) = 15
 * [1, 10, 5], sum = (1 + 10 + 5) = 16
 * [1, 4, 5], sum = (1 + 4 + 5) = 10
 * [10, 4, 5], sum = (10 + 4 + 5) = 19
 * Triplet [1, 4, 5] has sum = 10 which is closest to target.
 */
public class QM6 {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 2, 2, 4};
        int target = 4;
        System.out.println(findTripletSumColsestToTarget(arr, target));
    }

    private static int findTripletSumColsestToTarget(int[] arr, int target) {
        int minVal = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (minVal > Math.abs(target - sum)) {
                        minVal = Math.abs(target - sum);
                        result = sum;
                    }
                    if (minVal == Math.abs(target - sum)) {
                        result = Math.max(result, sum);
                    }


                }
            }
        }
        return result;
    }
}
