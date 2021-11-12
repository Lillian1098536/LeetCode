package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P680_ValidPalindromeIITest {
    P680_ValidPalindromeII test = new P680_ValidPalindromeII();
    @Test
    public void validPalindrome() {
        assertTrue(test.validPalindrome("aba"));
        assertTrue(test.validPalindrome("abca"));
        assertFalse(test.validPalindrome("abc"));
        assertTrue(test.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}