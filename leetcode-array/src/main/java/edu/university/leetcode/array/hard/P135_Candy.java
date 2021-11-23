package edu.university.leetcode.array.hard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 135. Candy
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 * You are giving candies to these children subjected to the following requirements:
 *     - Each child must have at least one candy.
 *     - Children with a higher rating get more candies than their neighbors.
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 * Example 1: Input: ratings = [1,0,2] Output: 5
 * Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
 * Example 2: Input: ratings = [1,2,2] Output: 4
 * Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
 * The third child gets 1 candy because it satisfies the above two conditions.
 * Constraints:
 * n == ratings.length
 * 1 <= n <= 2 * 104
 * 0 <= ratings[i] <= 2 * 104
 */
public class P135_Candy {
    private static final Logger LOG = LoggerFactory.getLogger(P135_Candy.class);
    //greedy
    public int candy(int[] ratings) {
        int candy = 1, cur = 1, descCount = 0, max = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                cur++;
                candy += cur;
                max = cur;
                descCount = 0;
                LOG.info("i={} cur={} candy={}", i, cur, candy);
            } else if (ratings[i] == ratings[i - 1]) {
                candy++;
                cur = 1;
                max = 1;
                descCount = 0;
                LOG.info("i={} candy={}", i, candy);
            } else {
                LOG.info("i={} descCount={} candy={}", i, descCount, candy);
                candy++;
                candy += descCount;
                descCount++;
                if (max <= descCount) {
                    candy++;
                }
                cur = 1;
            }
        }
        return candy;
    }
    //dp
    public int dpCandy(int[] ratings) {
        int[] dp = new int[ratings.length];
        dp[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && dp[i] <= dp[i + 1]) {
                dp[i] = dp[i + 1] + 1;
            }
        }
        int candy = 0;
        for (int n : dp) {
            candy += n;
        }
        return candy;
    }
}