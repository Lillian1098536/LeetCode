package edu.university.leetcode.binary.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 371. Sum of Two Integers
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * Example 1: Input: a = 1, b = 2 Output: 3
 * Example 2: Input: a = -2, b = 3 Output: 1
 */
@Slf4j
public class P371_SumOfTwoIntegers {

    public static int getSum(int a, int b) {
        if (b == 0) {
            log.info("sum = {}", a);
            return a;
        }
        int sum = a ^ b;
        log.info("tmp = {}", Integer.toBinaryString(sum));
        int carry = (a & b) << 1;
        log.info("carry = {}", Integer.toBinaryString(carry));
        return getSum(sum, carry);
    }

}
