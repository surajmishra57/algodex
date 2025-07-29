package org.example.prefix_sum.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array arr[] of n integers and q queries represented by an array queries[][], where queries[i][0] = l and queries[i][1] = r. For each query, the task is to calculate the mean of elements in the range l to r and return its floor value.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [3, 7, 2, 8, 5] queries[][] = [[1, 3], [2, 5]]
 * Output: 4 5
 * Explanation: For query [1, 3] - Elements in range are 3, 7, 2
 * Mean is (3+7+2)/3 = 4, Floor value is 4
 * For query [2, 5] - Elements in range are 7, 2, 8, 5,
 * Mean is (7+2+8+5)/4 = 5.5, Floor value is 5
 * <p>
 * Input: arr[] = [10, 20, 30, 40, 50, 60], queries[][] = [[4, 6]]
 * Output: 50
 * Explanation: For query [4, 6] - Elements in range are 40, 50, 60
 * Mean is (40+50+60)/3 = 50, Floor value is 50
 */
public class Q2 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 7, 2, 8, 5};
        int[][] queries = new int[][]{{1, 3}, {2, 5}};
        System.out.println(meanOfRangeOfArray(nums, queries));
    }

    private static List<Integer> meanOfRangeOfArray(int[] nums, int[][] queries) {
        List<Integer> res = new ArrayList<>();
        int[] prefixSum = new int[nums.length + 1];
//        prefixSum[0] = nums[0];
        for (int i = 1; i <= nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i-1];
        }

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0] - 1;
            int r = queries[i][1] - 1;

            int sum = prefixSum[r + 1] - prefixSum[l];

            int len = r - l + 1;
            res.add((int) sum / len);
        }
        return res;

    }
}
