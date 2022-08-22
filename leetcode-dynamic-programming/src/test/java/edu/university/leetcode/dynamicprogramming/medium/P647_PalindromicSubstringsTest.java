package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P647_PalindromicSubstringsTest {
    P647_PalindromicSubstrings test = new P647_PalindromicSubstrings();
    @Test
    public void countSubstrings() {
        assertEquals(3, test.countSubstrings("abc"));
        assertEquals(6, test.countSubstrings("aaa"));
    }
}