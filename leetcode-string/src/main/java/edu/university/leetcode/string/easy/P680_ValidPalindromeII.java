package edu.university.leetcode.string.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 680. Valid Palindrome II
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 * Example 1: Input: s = "aba" Output: true
 * Example 2: Input: s = "abca" Output: true
 * Explanation: You could delete the character 'c'.
 * Example 3: Input: s = "abc" Output: false
 * Constraints:
 * 1 <= s.length <= 105
 * s consists of lowercase English letters.
 */
public class P680_ValidPalindromeII {
    private static final Logger LOG = LoggerFactory.getLogger(P680_ValidPalindromeII.class);
    public boolean validPalindrome(String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo <= hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return valid(s, lo + 1, hi) || valid(s, lo, hi - 1);
            }
            lo++;
            hi--;
        }
        return true;
    }

    private boolean valid(String s, int start, int end) {
        int lo = start, hi = end;
        while (lo <= hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }

}
