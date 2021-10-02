package edu.university.leetcode.number.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 69. Sqrt(x)
 * Implement int sqrt(int x). Compute and return the square root of x.
 * x is guaranteed to be a non-negative integer.
 * Example 1: Input: 4 Output: 2
 * Example 2: Input: 8 Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we want to return an integer, the decimal part will be truncated.
 */
public class P69_SqrtX {
    private final static Logger LOG = LoggerFactory.getLogger(P69_SqrtX.class);
    public int mySqrt(int x) {
        if (x <= 1) { return x; }
        int start = 1, end = x, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            LOG.info("start={} end={} mid={}", start, end, mid);
            // x / mid == mid will over flow
            if (mid == x / mid) {
                return mid;
            } else {
                if (mid < x / mid) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            LOG.info("after start={} end={}", start, end);
        }
        // when finished, end < start, so return end
        return end;
    }
}
