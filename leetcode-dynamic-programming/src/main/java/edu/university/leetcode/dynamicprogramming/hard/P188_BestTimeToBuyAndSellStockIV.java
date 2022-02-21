package edu.university.leetcode.dynamicprogramming.hard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 188. Best Time to Buy and Sell Stock IV
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day, and an integer k.
 * Find the maximum profit you can achieve. You may complete at most k transactions.
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 * Example 1: Input: k = 2, prices = [2,4,1] Output: 2
 * Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit = 4-2 = 2.
 * Example 2: Input: k = 2, prices = [3,2,6,5,0,3] Output: 7
 * Explanation: Buy on day 2 (price = 2) and sell on day 3 (price = 6), profit = 6-2 = 4.
 * Then buy on day 5 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
 * Constraints:
 * 0 <= k <= 100
 * 0 <= prices.length <= 1000
 * 0 <= prices[i] <= 1000
 */
public class P188_BestTimeToBuyAndSellStockIV {
    private static final Logger LOG = LoggerFactory.getLogger(P188_BestTimeToBuyAndSellStockIV.class);
    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if (k == 0 || len < 2) { return 0; }
        if ( k >= len / 2) {
            return greedy(prices);
        }
        int[][] dp = new int[k + 1][2];
        // init 1 buy to MIN and 0 sell to 0
        for (int i = 0; i <= k; i++) {
            dp[i][1] = Integer.MIN_VALUE;
        }
        for (int price : prices) {
            for (int i = 1; i <= k; i++) {
                dp[i][1] = Math.max(dp[i][1], dp[i - 1][0] - price); //1, buy
                dp[i][0] = Math.max(dp[i][0], dp[i][1] + price); //0, sell
            }
        }
        LOG.info("dp = ");
        for (int[] row : dp) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println("");
        }
        return dp[k][0]; //max of sell
    }

    private int greedy(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                result += prices[i] - prices[i - 1];
            }
        }
        return result;
    }
}
