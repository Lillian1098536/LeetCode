package edu.university.leetcode.string.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class P44_WildcardMatchingTest {
    @Test
    public void isMatch() throws Exception {
        String s = "adceb";
        String p = "*a*b";
        assertTrue(P44_WildcardMatching.isMatch(s, p));
    }

}