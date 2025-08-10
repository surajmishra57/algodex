package org.example.dp.basic;

/**
 * Minimum Cost to Reach the Top
 * Last Updated : 11 Jul, 2025
 * Given an array of integers cost[] of length n, where cost[i] is the cost of the ith step on a staircase. Once the cost is paid, we can either climb one or two steps.
 * We can either start from the step with index 0, or the step with index 1. The task is to find the minimum cost to reach the top.
 * <p>
 * Examples:
 * <p>
 * Input: cost[] = [10, 15, 20]
 * Output: 15
 * Explanation: The cheapest option is to start from step with index 1, pay cost[1] and go to the top.
 */
public class Q6 {
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        System.out.println(minCostClimbingStairs(cost));
    }

    private static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 1) return cost[0];
        return Math.min((minCostRecur(n - 1, cost)), minCostRecur(n - 2, cost));
    }

    private static int minCostRecur(int i, int[] cost) {
        if (i == 0 || i == 1) {
            return cost[i];
        }
        return cost[i] + Math.min(minCostRecur(i - 1, cost), minCostRecur(i - 2, cost));

    }
}
