package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P520_DetectCapitalTest {

    @Test
    public void detectCapitalUseAllCapital() {
        assertTrue(P520_DetectCapital.detectCapitalUse("USA"));
    }

    @Test
    public void detectCapitalUseFirstCapital() {
        assertTrue(P520_DetectCapital.detectCapitalUse("Google"));
    }

    @Test
    public void detectCapitalUseLastCapital() {
        assertTrue(!P520_DetectCapital.detectCapitalUse("flaG"));
    }

}