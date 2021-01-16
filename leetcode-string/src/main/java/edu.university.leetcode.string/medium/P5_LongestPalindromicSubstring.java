package edu.university.leetcode.string.medium;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class P5_LongestPalindromicSubstring {

    private static final Logger LOG = LoggerFactory.getLogger(P5_LongestPalindromicSubstring.class);

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int maxLength = 1, start = 0, low, high;
        // One by one consider every character as center
        // point of even and length palindromes
        for (int i = 0, len = s.length(); i < len; ++i) {
            // Find the longest even length palindrome with
            // center points as i-1 and i.
            low = i - 1;
            high = i;
            while (low >= 0 && high < len && s.charAt(low) == s.charAt(high)) {
                LOG.debug("center={}", i);
                if (high - low + 1 > maxLength) {
                    start = low;
                    LOG.debug("even start={}", start);
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
                LOG.debug("center={}", i);
                if (high - low + 1 > maxLength) {
                    start = low;
                    LOG.debug("odd start={}", start);
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
        }
        LOG.debug("the longest palindrome substring of '{}' is '{}',length={}, start={}", s, s.substring(start, start + maxLength), maxLength, start);
        return s.substring(start, start + maxLength);
    }

    public static String longestPalindromeSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0, length = s.length(); i < length; i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    /**
     * dynamic programming
     * Time O(n^2) Space O(n^2)
     */
    public String dpLongestPalindrome(String s) {
        if (s == null || s.length() < 1) return s;
        int len = s.length(), maxLen = 1;
        String longest = null;
        boolean[][] dp = new boolean[len][len];
        for (int l = 0; l < len; l++) {
            for (int i = 0; i < len - 1; i++) {
                int j = i + 1;
                if (s.charAt(i) ==  s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        longest = s.substring(i, j + 1);
                    }
                }
            }
        }
        return longest;
    }

    /**
     * recursive
     * Time O(n^2) Space O(n^2)
     */

}
