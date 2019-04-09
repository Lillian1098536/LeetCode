package edu.university.leetcode.number.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 507. Perfect Number
 * We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself
 * Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not
 * Example: Input: 28  Output: True
 * Explanation: 28 = 1 + 2 + 4 + 7 + 14
 * Note: The input number n will not exceed 100,000,000. (1e8)
 */
@Slf4j
public class P507_PerfectNumber {

    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 1, max = num / 2;
        for (int n = 2; n < max; n++) {
            if (num % n == 0) {
                int tmp = num / n;
                if (tmp != n) {
                    sum += tmp + n;
                } else {
                    sum += n;
                }
                max = tmp;
                if (sum > num) {
                    return false;
                }
            }
        }
        log.info("sum = {}", sum);
        return sum == num;
    }

    public static boolean checkPerfectNumberN(int num) {
        if (num <= 1) return false;
        int sum = 1, max = (int)Math.sqrt(num);
        for (int n = 2; n <= max; n++) {
            if (num % n != 0) {
                continue;
            }
            sum += n;
            if (n * n != num) {
                sum += num / n;
            }
        }
        return sum == num;
    }

}
