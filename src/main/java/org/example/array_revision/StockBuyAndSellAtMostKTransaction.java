package org.example.array_revision;

public class StockBuyAndSellAtMostKTransaction {
    public static void main(String[] args) {
        int k = 2;
        int[] prices = {10, 22, 5, 80};
        System.out.println(maxProfit(prices, k));
    }

    private static int maxProfit(int[] prices, int k) {
        int n = prices.length;
        if (n == 0 || k == 0)
            return 0;

        int[][] curr = new int[k + 1][2];
        int[][] next = new int[k + 1][2];
        for (int i = n - 1; i >= 0; i--) {
            for (int l = 1; l <= k; l++) {
                // buy
                curr[l][1] = Math.max(-prices[i] + next[l][0], next[l][1]);
                // sell
                curr[l][0] = Math.max(prices[i] + next[l - 1][1], next[l][0]);
            }

            for (int l = 0; l <= k; l++) {
                next[l][0] = curr[l][0];
                next[l][1] = curr[l][1];
            }
        }
        return curr[k][1];
    }
}
