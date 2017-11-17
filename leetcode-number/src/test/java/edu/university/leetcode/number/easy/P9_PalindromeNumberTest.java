package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P9_PalindromeNumberTest {

    @Test
    public void isPalindrome1() throws Exception {
        boolean result = P9_PalindromeNumber.isPalindrome(12321);
        assertEquals(true, result);
    }

    @Test
    public void isPalindrome2() throws Exception {
        boolean result = P9_PalindromeNumber.isPalindrome(12345);
        assertEquals(false, result);
    }

    @Test
    public void isPalindrome3() throws Exception {
        boolean result = P9_PalindromeNumber.isPalindrome(-12345);
        assertEquals(false, result);
    }

}