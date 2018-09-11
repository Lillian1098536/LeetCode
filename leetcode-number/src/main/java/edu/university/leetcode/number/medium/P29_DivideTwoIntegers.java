package edu.university.leetcode.number.medium;

/**
 * 29. Divide Two Integers
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
 * Return the quotient after dividing dividend by divisor.
 * The integer division should truncate toward zero.
 * Example 1: Input: dividend = 10, divisor = 3 Output: 3
 * Example 2: Input: dividend = 7, divisor = -3 Output: -2
 */
public class P29_DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        if (divisor == 0) throw new ArithmeticException("/ by zero");
        if (dividend == 0) return 0;
        boolean sign = (dividend < 0) ^ (divisor < 0);
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        long quotient = 0, dividendLong = Math.abs((long)dividend), divisorLong = Math.abs((long)divisor);
        while (dividendLong >= divisorLong) {
            int factor = 1;
            long tmp = divisorLong;
            while (dividendLong >= tmp << 1) {
                factor <<= 1;
                tmp <<= 1;
            }
            dividendLong -= tmp;
            quotient += factor;
        }
        return (int)(sign ? quotient : -quotient);
    }

}
