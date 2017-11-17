package edu.university.leetcode.string.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P5_LongestPalindromicSubstringTest {
    @Test
    public void longestPalindrome1() throws Exception {
        String result = P5_LongestPalindromicSubstring.longestPalindrome("forgeeksskeegfor");
        assertEquals("geeksskeeg", result);
    }

    @Test
    public void longestPalindrome2() throws Exception {
        String result = P5_LongestPalindromicSubstring.longestPalindrome("babad");
        assertEquals("bab", result);
    }

    @Test
    public void longestPalindrome3() throws Exception {
        String result = P5_LongestPalindromicSubstring.longestPalindrome("cbbd");
        assertEquals("bb", result);
    }

    @Test
    public void longestPalindrome4() throws Exception {
        String result = P5_LongestPalindromicSubstring.longestPalindromeSubstring("forgeeksskeegfor");
        assertEquals("geeksskeeg", result);
    }

    @Test
    public void longestPalindrome5() throws Exception {
        String result = P5_LongestPalindromicSubstring.longestPalindromeSubstring("babad");
        assertEquals("aba", result);
    }

    @Test
    public void longestPalindrome6() throws Exception {
        String result = P5_LongestPalindromicSubstring.longestPalindromeSubstring("cbbd");
        assertEquals("bb", result);
    }

}