package edu.university.leetcode.string;

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

}