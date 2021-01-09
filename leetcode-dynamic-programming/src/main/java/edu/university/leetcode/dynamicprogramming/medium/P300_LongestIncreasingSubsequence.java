package edu.university.leetcode.dynamicprogramming.medium;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * 300. Longest Increasing Subsequence
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 * Example: Input: [10,9,2,5,3,7,101,18] Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 * Note:
 * There may be more than one LIS combination, it is only necessary for you to return the length.
 * Your algorithm should run in O(n2) complexity.
 */
public class P300_LongestIncreasingSubsequence {

    private static final Logger log = LoggerFactory.getLogger(P300_LongestIncreasingSubsequence.class);

    public static int lengthOfLIS(int[] nums) {
        int maxLen = 0;
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            log.info("i = {}", i);
            for (int j = 0; j < i; j++) {
                log.info("j = {}", j);
                if (nums[i] > nums[j]) {
                    log.info("nums[{}] = {} nums[{}] = {}", i, nums[i], j, nums[j]);
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    log.info("dp[{}] = {} dp[{}] + 1 = {}", i, dp[i], j, dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i] + 1);
        }
        log.info("dp = {}", dp);
        return maxLen;
    }

}
