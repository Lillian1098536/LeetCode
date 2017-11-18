package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P14_LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix1() throws Exception {
        String[] strs = {"Hello", "HelloMan", "Hell", "HellMan"};
        String result = P14_LongestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("Hell", result);
    }

    @Test
    public void longestCommonPrefix2() throws Exception {
        String[] strs = {"flower", "flow", "flight"};
        String result = P14_LongestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("fl", result);
    }

}