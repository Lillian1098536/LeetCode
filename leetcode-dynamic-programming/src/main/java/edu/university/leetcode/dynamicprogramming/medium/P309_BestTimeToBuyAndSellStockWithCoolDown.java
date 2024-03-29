package edu.university.leetcode.dynamicprogramming.medium;

/**
 * 309. Best Time to Buy and Sell Stock with Cool Down
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * Find the maximum profit you can achieve. You may complete as many transactions as you like (
 * i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
 * After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 * Example 1: Input: prices = [1,2,3,0,2] Output: 3
 * Explanation: transactions = [buy, sell, cool down, buy, sell]
 * Example 2: Input: prices = [1] Output: 0
 * Constraints:
 * 1 <= prices.length <= 5000
 * 0 <= prices[i] <= 1000
 */
public class P309_BestTimeToBuyAndSellStockWithCoolDown {
    /**
     * Time complex O(N)
     * Space complex O(N)
     */
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }
        int[][] dp = new int[len][3];
        dp[0][0] = 0;           //0, no stock on hand -> cool down
        dp[0][1] = - prices[0]; //1, stock on hand    -> buy
        dp[0][2] = 0;           //2, no stock on hand -> sell
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            dp[i][2] = dp[i - 1][1] + prices[i];
        }
        return Math.max(dp[len - 1][0], dp[len - 1][2]);
    }
}
