package edu.university.leetcode.dynamicprogramming.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 96. Unique Binary Search Trees
 * Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.
 * Example 1: Input: n = 3 Output: 5
 * Example 2: Input: n = 1 Output: 1
 * Constraints: 1 <= n <= 19
 */
public class P96_UniqueBinarySearchTrees {
    private static final Logger LOG = LoggerFactory.getLogger(P96_UniqueBinarySearchTrees.class);
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                        // n-i in right * i-1 in left
                LOG.info("i = {} j = {} dp[i - j] = {} dp[j - 1] = {}", i, j, dp[i - j], dp[j - 1]);
                dp[i] = dp[i] + (dp[i - j] * dp[j - 1]);
                LOG.info("            dp[i] = {}", dp[i]);
            }
        }
        return dp[n];
    }
}
