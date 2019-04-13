package edu.university.leetcode.number.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 400. Nth Digit
 * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
 * Note: n is positive and will fit within the range of a 32-bit signed integer (n < 231).
 * Example 1: Input: 3 Output: 3
 * Example 2: Input: 11 Output: 0
 * Explanation:
 * The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
 */
@Slf4j
public class P400_NthDigit {

    public static int findNthDigit(int n) {
        int len = 1;
        long digitNum = 9, start = 0;
        while (n > len * digitNum) {
            n -= len * digitNum;
            start += digitNum;
            len++;
            digitNum *= 10;
        }
        log.info("len = {} start = {}", len, start);
        int result;
        if (n % len == 0) {
            log.info("n = {} subNum = {}", n, "" + (start + n / len));
            result = ("" + (start + n / len)).charAt(len - 1) - '0';
        } else {
            log.info("n = {} >>> subNum = {}", n, "" + (start + n / len + 1));
            result = ("" + (start + n / len + 1)).charAt(n % len - 1) - '0';
        }
        return result;
    }

}
