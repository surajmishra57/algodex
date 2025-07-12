package org.example.array.hard;

/**
 * https://www.geeksforgeeks.org/dsa/maximum-profit-by-buying-and-selling-a-share-at-most-k-times/
 * Stock Buy and Sell - At-most k Transactions Allowed
 * Last Updated : 18 Mar, 2025
 * In share trading, a buyer buys shares and sells on a future date. Given the stock price of n days, the trader is allowed to make at most k transactions (a transaction is a combination of a buy and a sell), where a new transaction can only start after the previous transaction is complete, find out the maximum profit that a share trader could have made.
 * <p>
 * Examples:
 * <p>
 * Input: prices = [10, 22, 5, 80], k = 2
 * Output: 87
 * Explanation: Buy on 1st day at 10 and sell on 2nd day at 22. Then, again buy on 3rd day at 5 and sell on 4th day at 80. Total profit = 12 + 75 = 87
 * <p>
 * Input: prices = [12, 14, 17, 10, 14, 13, 12, 15], k = 3
 * Output: 12
 * Explanation: Buy on 1st day and at 12 and sell on 3rd day at 17. Then, again buy on 4th day at 10  and sell on 5th day at 14. Lastly, buy on 7th day at 12 and sell on 8th day at 15. Total profit = 5 + 4 + 3 = 12
 * <p>
 * Input: prices = [100, 30, 15, 10, 8, 25, 80], k = 3
 * Output: 72
 * Explanation: Buy on 5th day at 8 and sell on 7th day at 80. Total profit = 72.
 * <p>
 * Input: prices = [90, 80, 70, 60, 50], k = 1
 * Output: 0
 * Explanation: Not possible to earn.
 */
public class Q5 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 14, 17, 10, 14, 13, 12, 15};
        int k = 2;
        System.out.println(buyAndSellStockKTimes(arr, k));
    }

    private static int buyAndSellStockKTimes(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k == 0)
            return 0;

        int[][] curr = new int[k + 1][2];
        int[][] next = new int[k + 1][2];

        for (int i = n - 1; i >= 0; i--) {
            for (int l = 1; l <= k; l++) {
                curr[l][1] = Math.max(-arr[i] + next[l][0], next[l][1]);
                curr[l][0] = Math.max(arr[i] + next[l - 1][1], next[l][0]);
            }
            for (int j = 0; j <= k; j++) {
                next[j][0] = curr[j][0];
                next[j][1] = curr[j][1];
            }
        }
        return curr[k][1];
    }
}
