package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P316_RemoveDuplicateLettersTest {
    P316_RemoveDuplicateLetters test = new P316_RemoveDuplicateLetters();
    @Test
    public void removeDuplicateLetters() {
        assertTrue("abc".equals(test.removeDuplicateLetters("bcabc")));
        assertTrue("acdb".equals(test.removeDuplicateLetters("cbacdcbc")));
    }
}