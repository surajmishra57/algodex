package org.example.dp.basic;

import java.util.Arrays;

/**
 * Count ways to reach the nth stair using step 1, 2 or 3
 * Last Updated : 12 Dec, 2024
 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time.
 * The task is to implement a method to count how many possible ways the child can run up the stairs.
 * <p>
 * Examples:
 * <p>
 * Input: 4
 * Output: 7
 * Explanation: There are seven ways: {1, 1, 1, 1}, {1, 2, 1}, {2, 1, 1}, {1, 1, 2}, {2, 2}, {3, 1}, {1, 3}.
 * <p>
 * Input: 3
 * Output: 4
 * Explanation: There are four ways: {1, 1, 1}, {1, 2}, {2, 1}, {3}.
 */
public class Q5 {
    public static void main(String[] args) {
        System.out.println(countWaysToReachNthWayUsingRecursion(34));
        int[] memo = new int[35];
        Arrays.fill(memo, -1);
        System.out.println(countWaysToReachNthWayUsingMemorization(34, memo));
    }

    private static int countWaysToReachNthWayUsingMemorization(int i, int[] memo) {
        if (i == 0)
            return 1;
        if (i < 0)
            return 0;
        if (memo[i] != -1)
            return memo[i];
        memo[i] = countWaysToReachNthWayUsingMemorization(i - 3, memo)
                + countWaysToReachNthWayUsingMemorization(i - 2, memo)
                + countWaysToReachNthWayUsingMemorization(i - 1, memo);
        return memo[i];
    }

    private static int countWaysToReachNthWayUsingRecursion(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        return countWaysToReachNthWayUsingRecursion(n - 3)
                + countWaysToReachNthWayUsingRecursion(n - 2)
                + countWaysToReachNthWayUsingRecursion(n - 1);
    }
}
