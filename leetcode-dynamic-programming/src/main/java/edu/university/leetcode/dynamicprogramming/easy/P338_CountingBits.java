package edu.university.leetcode.dynamicprogramming.easy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 338. Counting Bits
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 * Example 1: Input: n = 2 Output: [0,1,1]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * Example 2: Input: n = 5 Output: [0,1,1,2,1,2]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 * Constraints:
 * 0 <= n <= 105
 * Follow up:
 * It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?
 * Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?
 */
public class P338_CountingBits {
    public static final Logger LOG = LogManager.getLogger(P338_CountingBits.class);
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = dp[i / 2];
            }
        }
        return dp;
    }

    public String toString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int a : array) {
            sb.append(a).append(",");
        }
        sb.append("]");
        return sb.toString().replace(",]", "]");
    }

    public static void main(String[] args) {
        P338_CountingBits test = new P338_CountingBits();
        System.out.println(test.toString(test.countBits(2)));
        System.out.println(test.toString(test.countBits(5)));
    }


}
