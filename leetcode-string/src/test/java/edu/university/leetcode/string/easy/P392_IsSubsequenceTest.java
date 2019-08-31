package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P392_IsSubsequenceTest {

    @Test
    public void isSubsequenceTrue() {
        assertTrue(P392_IsSubsequence.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void isSubsequenceFalse() {
        assertTrue(!P392_IsSubsequence.isSubsequence("axc", "ahbgdc"));

    }
}