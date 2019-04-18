package edu.university.leetcode.binary.medium;

import lombok.extern.slf4j.Slf4j;

/**
 * 50. Pow(x, n)
 * Implement pow(x, n), which calculates x raised to the power n (xn).
 * Example 1: Input: 2.00000, 10 Output: 1024.00000
 * Example 2: 2.10000, 3 Output: 9.26100
 * Example 3: Input: 2.00000, -2 Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 * Note: -100.0 < x < 100.0, n is a 32-bit signed integer, within the range [−2^31, 2^31 − 1]
 */
@Slf4j
public class P50_PowXN {

    public static double myPow(double x, int n) {
        // if n is negative, avoid overflow
        int m = n < 0 ? -n - 1 : n;
        double p = 1;
        for (double q = x; m > 0; m /= 2) {
            log.info("n = {} q = {}", m, q);
            if ((m & 1) == 1) p *= q;
            q *= q;
            log.info("p = {}", p);
        }
        return n < 0 ? 1 / p / x : p;
    }

    public static double myPow2(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return myPow2Helper(x, n);
        } else {
            return 1 / myPow2Helper(x, -((long)n));
        }
    }

    public static double myPow2Helper(double x, long n) {
        if (n == 1) {
            return x;
        }
        if (n % 2 == 0) {
            return myPow2Helper(x * x, n / 2);
        } else {
            return myPow2Helper(x * x, n / 2) * x;
        }
    }

}
