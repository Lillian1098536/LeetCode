package edu.university.leetcode.dynamicprogramming.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 1395. Count Number of Teams
 * There are n soldiers standing in a line. Each soldier is assigned a unique rating value.
 * You have to form a team of 3 soldiers amongst them under the following rules:
 * Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
 * A team is valid if: (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
 * Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).
 * Example 1: Input: rating = [2,5,3,4,1] Output: 3
 * Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1).
 * Example 2: Input: rating = [2,1,3] Output: 0
 * Explanation: We can't form any team given the conditions.
 * Example 3: Input: rating = [1,2,3,4] Output: 4
 * Constraints:
 * n == rating.length
 * 3 <= n <= 1000
 * 1 <= rating[i] <= 105
 * All the integers in rating are unique.
 */
public class P1395_CountNumberOfTeams {
    private static final Logger LOG = LoggerFactory.getLogger(P1395_CountNumberOfTeams.class);
    public int numTeams(int[] rating) {
        int count = 0, len = rating.length;
        int[] ascDp = new int[len], descDp = new int[len];
        // rating = [2,5,3,4,1]
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                // rating[i] < rating[j] < rating[k]
                if (rating[i] > rating[j]) {
                    ascDp[i]++;
                    count += ascDp[j];
                    LOG.info("i={} count={} j={} ascDp={}", i, count, j, ascDp);
                }
                // rating[i] > rating[j] > rating[k]
                if (rating[i] < rating[j]) {
                    descDp[i]++;
                    count += descDp[j];
                    LOG.info("i={} count={}                           j={} descDp={}", i, count, j, descDp);
                }
            }
        }
        return count;
    }
}