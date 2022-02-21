package edu.university.leetcode.number.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 2180. Count Integers With Even Digit Sum
 * Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.
 * The digit sum of a positive integer is the sum of all its digits.
 * Example 1: Input: num = 4 Output: 2
 * Explanation:
 * The only integers less than or equal to 4 whose digit sums are even are 2 and 4.
 * Example 2: Input: num = 30 Output: 14
 * Explanation:
 * The 14 integers less than or equal to 30 whose digit sums are even are
 * 2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.
 */
public class P2180_CountIntegersWithEvenDigitSum {
    private final static Logger LOG = LoggerFactory.getLogger(P2180_CountIntegersWithEvenDigitSum.class);

    /**
     * Numbers
     * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22...
     * Digit sums, 1 represents odd and 0 represents even
     * 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0...
     * only need to check the digit sum of the last number -> bit operation O(1)
     */
    public int countEven(int num) {
        int sum = 0, tmp = num;
        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }
        LOG.info("num={} sum={} count={}", num, sum, (num - (sum & 1)) / 2);
        return (num - (sum & 1)) / 2;
    }
}
