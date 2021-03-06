package edu.university.leetcode.number.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 9. Palindrome Number
 * Determine whether an integer is a palindrome.
 * Do this without extra space, means with O(1) space
 */
 @Slf4j
public class P9_PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int tmp = 1;
        while ( x / tmp >= 10) {
            tmp *= 10;
        }
        log.debug("tmp={}", tmp);
        while (x > 0) {
            if (x / tmp != x % 10) {
                return  false;
            }
            x = (x % tmp) / 10;
            tmp /= 100;
        }
        return true;
    }

}
