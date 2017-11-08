package edu.university.leetcode.string;

import lombok.extern.slf4j.Slf4j;

/**
 * 5. Longest Palindromic Substring
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 * Example: Input: "babad" Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example: Input: "cbbd" Output: "bb"
 * Time complexity: O ( n^2 ) where n is the length of input string.
 * Auxiliary Space: O ( 1 )
 */
@Slf4j
public class P5_LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        int maxLength = 1, start = 0, low, high;
        // One by one consider every character as center
        // point of even and length palindromes
        for (int i = 0, len = s.length(); i < len; ++i) {
            // Find the longest even length palindrome with
            // center points as i-1 and i.
            low = i - 1;
            high = i;
            while (low >= 0 && high < len && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    log.debug("start={}", start);
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
            // Find the longest odd length palindrome with
            // center point as i
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    log.debug("start={}", start);
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
        }
        log.debug("the longest palindrome substring of '{}' is '{}',length={}, start={}", s, s.substring(start, start + maxLength), maxLength, start);
        return s.substring(start, start + maxLength);
    }
}
