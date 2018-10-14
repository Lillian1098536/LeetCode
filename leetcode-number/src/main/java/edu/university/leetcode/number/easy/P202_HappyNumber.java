package edu.university.leetcode.number.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 202. Happy Number
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * Example: Input: 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * unhappy number circle 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4
 * happy number 1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100
 */
@Slf4j
public class P202_HappyNumber {

    public static boolean isHappy(int n) {
        while(n >= 10){
            n = getNumber(n);
        }
        log.info("n={}", n);
        return (n == 1 || n == 7);
    }

    private static int getNumber(int n) {
        int result = 0;
        while (n > 0) {
            result += Math.pow(n % 10, 2);
            n /= 10;
        }
        log.info(" -> {}", result);
        return result;
    }

    public boolean isHappyNumber(int n) {
        // 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4
        while (n != 1 || n != 4) {
            int tmp = n;
            n = 0;
            while (tmp > 0) {
                int d = tmp % 10;
                n += d * d;
                tmp /= 10;
            }
        }
        return n == 1;
    }

}
