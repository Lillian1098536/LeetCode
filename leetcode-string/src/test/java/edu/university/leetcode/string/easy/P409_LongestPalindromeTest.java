package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P409_LongestPalindromeTest {

    @Test
    public void longestPalindrome() {
        assertEquals(7, P409_LongestPalindrome.longestPalindrome("dccaccd"));
    }

    @Test
    public void longestPalindromeTest() {
        assertEquals(3, P409_LongestPalindrome.longestPalindrome("ABCDEFGHIJKLMNOPQRESTUVWXYZabcdefghijklmnopqrstuvwxyz"));
    }
}