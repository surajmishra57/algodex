package org.example.dp.basic;

import java.util.Arrays;

/**
 * Climbing stairs to reach the top
 * Last Updated : 23 Jul, 2025
 * There are n stairs, and a person standing at the bottom wants to climb stairs to reach the top. The person can climb either 1 stair or 2 stairs at a time, the task is to count the number of ways that a person can reach at the top.
 * <p>
 * Note: This problem is similar to Count ways to reach Nth stair (Order does not matter) with the only difference that in this problem, we count all distinct ways where different orderings of the steps are considered unique.
 * <p>
 * Examples:
 * <p>
 * Input: n = 1
 * Output: 1
 * Explanation: There is only one way to climb 1 stair.
 * <p>
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to reach 2th stair: {1, 1} and {2}.
 * <p>
 * Input: n = 4
 * Output: 5
 * Explanation: There are five ways to reach 4th stair: {1, 1, 1, 1}, {1, 1, 2}, {2, 1, 1}, {1, 2, 1} and {2, 2}.
 */
public class Q4 {
    public static void main(String[] args) {
        System.out.println(countClimbingStairs(20));
        int[] memo = new int[101];
        Arrays.fill(memo, -1);
        System.out.println(countClimbingStairsUsingMemorization(60, memo));
    }

    private static int countClimbingStairsUsingMemorization(int i, int[] memo) {
        if (i == 0 || i == 1)
            return 1;
        if (memo[i] != -1)
            return memo[i];
        memo[i] = countClimbingStairsUsingMemorization(i - 2, memo) + countClimbingStairsUsingMemorization(i - 1, memo);
        return memo[i];
    }

    private static int countClimbingStairs(int n) {
        if (n == 1 || n == 0)
            return 1;
        return countClimbingStairs(n - 2) + countClimbingStairs(n - 1);
    }
}
