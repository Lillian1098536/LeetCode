package edu.university.leetcode.dynamicprogramming.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 322. Coin Change
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 * Example 1: Input: coins = [1, 2, 5], amount = 11 Output: 3 Explanation: 11 = 5 + 5 + 1
 * Example 2: Input: coins = [2], amount = 3 Output: -1
 */
public class P322_CoinChange {

    private static final Logger LOG = LoggerFactory.getLogger(P322_CoinChange.class);

    public static int coinChange(int[] coins, int amount) {
        if (amount < 0) return -1;
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            LOG.info("i = {}", i);
            int pre = -1;
            for (int c : coins) {
                if (i < c || dp[i - c] == 0) {
                    LOG.info("continue i = {} c = {}", i, c);
                    if (i >= c && dp[i - c] == 0) {
                        LOG.info("continue dp[i - c] == 0");
                    }
                    continue;
                }
                if (pre < 0) {
                    pre = dp[i - c];
                } else {
                    pre = Math.min(dp[i - c], pre);
                }
                LOG.info("c = {} pre = {}", c, pre);
            }
            dp[i] = pre < 0 ? 0 : pre + 1;
            LOG.info("pre = {} dp[] = {}", pre, dp);
        }
        LOG.info("at the end dp[] = {}", dp);
        return dp[amount] - 1;
    }

}
