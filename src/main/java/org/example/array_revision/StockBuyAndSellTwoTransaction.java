package org.example.array_revision;

public class StockBuyAndSellTwoTransaction {
    public static void main(String[] args) {
        int[] prices = {10, 22, 5, 75, 65, 80};
        System.out.println(maxProfitInTwoTransations(prices));
    }

    private static int maxProfitInTwoTransations(int[] prices) {
        int firstBuy = Integer.MIN_VALUE;
        int firstSell = 0;
        int secondBuy = Integer.MIN_VALUE;
        int secondSell = 0;

        for (int i = 0; i < prices.length; i++) {
            firstBuy = Math.max(firstBuy, -prices[i]);
            firstSell = Math.max(firstSell, firstBuy + prices[i]);
            secondBuy = Math.max(secondBuy, firstSell - prices[i]);
            secondSell = Math.max(secondSell, secondBuy + prices[i]);
        }

        return secondSell;

    }
}
