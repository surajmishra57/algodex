package org.example.recursion.medium;

/**
 * https://www.geeksforgeeks.org/dsa/coin-change-dp-7/
 * <p>
 * Coin Change - Count Ways to Make Sum
 * Last Updated : 27 Apr, 2025
 * Given an integer array of coins[] of size n representing different types of denominations and an integer sum, the task is to count all combinations of coins to make a given value sum.
 * <p>
 * Note: Assume that you have an infinite supply of each type of coin.
 * <p>
 * Examples:
 * <p>
 * Input: sum = 4, coins[] = [1, 2, 3]
 * Output: 4
 * Explanation: There are four solutions: [1, 1, 1, 1], [1, 1, 2], [2, 2] and [1, 3]
 * <p>
 * Input: sum = 10, coins[] = [2, 5, 3, 6]
 * Output: 5
 * Explanation: There are five solutions:
 * [2, 2, 2, 2, 2], [2, 2, 3, 3], [2, 2, 6], [2, 3, 5] and [5, 5]
 * <p>
 * Input: sum = 10, coins[] = [10]
 * Output: 1
 * Explanation: The only is to pick 1 coin of value 10.
 * <p>
 * Input: sum = 5, coins[] = [4]
 * Output: 0
 * Explanation:  We cannot make sum 5 with the given coins
 */
public class Q3 {
    public static void main(String[] args) {
        int sum = 10;
        int coins[] = new int[]{2, 5, 3, 6};
        System.out.println(coinChangeCountSum(coins, coins.length, sum));
    }

    private static int coinChangeCountSum(int[] coins, int length, int sum) {
        if (sum == 0)
            return 1;
        else if (sum < 0 || length == 0) {
            return 0;
        }
        return coinChangeCountSum(coins, length, sum - coins[length - 1]) + coinChangeCountSum(coins, length - 1, sum);

    }
}
