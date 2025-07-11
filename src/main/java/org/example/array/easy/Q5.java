package org.example.array.easy;

/**
 * Stock Buy and Sell - Multiple Transaction Allowed
 * Last Updated : 19 Mar, 2025
 * Given an array prices[] of size n denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.
 * <p>
 * Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.
 * <p>
 * Examples:
 * <p>
 * Input: prices[] = {100, 180, 260, 310, 40, 535, 695}
 * Output: 865
 * Explanation: Buy the stock on day 0 and sell it on day 3 => 310 - 100 = 210
 * Buy the stock on day 4 and sell it on day 6 => 695 - 40 = 655
 * Maximum Profit  = 210 + 655 = 865
 * <p>
 * <p>
 * <p>
 * Input: prices[] = {4, 2, 2, 2, 4}
 * Output: 2
 * Explanation: Buy the stock on day 3 and sell it on day 4 => 4 - 2 = 2
 * Maximum Profit  = 2
 */
public class Q5 {
    public static void main(String[] args) {
        int[] arr = new int[]{100, 180, 260, 310, 40, 535, 695};
        System.out.println(StockBuyAndSellMultipulTransationAllowed(arr));
    }

    private static int StockBuyAndSellMultipulTransationAllowed(int[] arr) {
        int profitResult = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profitResult += arr[i] - arr[i - 1];
            }
        }
        return profitResult;
    }
}
