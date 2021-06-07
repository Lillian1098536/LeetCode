package edu.university.leetcode.dynamicprogramming.hard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 72. Edit Distance
 * Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
 * You have the following three operations permitted on a word:
 * Insert a character
 * Delete a character
 * Replace a character
 * Example 1: Input: word1 = "horse", word2 = "ros" Output: 3
 * Explanation:
 * horse -> rorse (replace 'h' with 'r')
 * rorse -> rose (remove 'r')
 * rose -> ros (remove 'e')
 * Example 2: Input: word1 = "intention", word2 = "execution" Output: 5
 * Explanation:
 * intention -> inention (remove 't')
 * inention -> enention (replace 'i' with 'e')
 * enention -> exention (replace 'n' with 'x')
 * exention -> exection (replace 'n' with 'c')
 * exection -> execution (insert 'u')
 * Constraints:
 * 0 <= word1.length, word2.length <= 500
 * word1 and word2 consist of lowercase English letters.
 */
public class P72_EditDistance {
    private static final Logger LOG = LoggerFactory.getLogger(P72_EditDistance.class);
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[] dp = new int[n + 1];
        for (int j = 0; j <= n; j++) {
            dp[j] = j;
        }
        for (int i = 1; i <= m; i++) {
            LOG.info("i={}                                        dp={}", i, dp);
            int[] newDp = new int[n + 1];
            newDp[0] = i;
            for (int j = 1; j <= n; j++) {
                LOG.info("j={} newDp[0]={}", j, newDp[0]);
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    newDp[j] = dp[j - 1];
                    LOG.info("=====> the same char={}      newDp[j]={}", word1.charAt(i - 1), newDp[j]);
                } else {
                    LOG.info("dp[j - 1]={} dp[j]={} newDp[j - 1]={}", dp[j - 1], dp[j], newDp[j - 1]);
                    newDp[j] = min(dp[j - 1] + 1, dp[j] + 1, newDp[j - 1] + 1);
                    LOG.info("=====> the diff char={}<->{} newDp[j]={}", word1.charAt(i - 1), word2.charAt(j - 1), newDp[j]);
                }
            }
            dp = newDp;
        }
        LOG.info("final                                       dp={}", dp);
        return dp[n];
    }
    private int min(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        else if (b <= a && b <= c) return b;
        else return c;
    }
}
