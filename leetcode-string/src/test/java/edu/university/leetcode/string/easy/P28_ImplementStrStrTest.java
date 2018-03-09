package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P28_ImplementStrStrTest {

    @Test
    public void strStr1() throws Exception {
        String haystack = "hello", needle = "ll";
        int result = P28_ImplementStrStr.strStr(haystack, needle);
        assertEquals(2, result);
    }

    @Test
    public void strStr2() throws Exception {
        String haystack = "aaaaa", needle = "bba";
        int result = P28_ImplementStrStr.strStr(haystack, needle);
        assertEquals(-1, result);
    }

    @Test
    public void strStr3() throws Exception {
        String haystack = "hello", needle = "lo";
        int result = P28_ImplementStrStr.strStr(haystack, needle);
        assertEquals(3, result);
    }

    @Test
    public void strStr4() throws Exception {
        String haystack = "a", needle = "";
        int result = P28_ImplementStrStr.strStr(haystack, needle);
        assertEquals(0, result);
    }

    @Test
    public void strStr5() throws Exception {
        String haystack = "aaa", needle = "aaaa";
        int result = P28_ImplementStrStr.strStr(haystack, needle);
        assertEquals(-1, result);
    }

    @Test
    public void strStr6() throws Exception {
        String haystack = "mississippi", needle = "issipi";
        int result = P28_ImplementStrStr.strStr(haystack, needle);
        assertEquals(-1, result);
    }

}