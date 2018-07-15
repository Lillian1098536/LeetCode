package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P290_WordPatternTest {
    @Test
    public void wordPattern1() throws Exception {
        assertTrue(P290_WordPattern.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    public void wordPattern2() throws Exception {
        assertTrue(!P290_WordPattern.wordPattern("abba", "dog cat cat fish"));
    }

}