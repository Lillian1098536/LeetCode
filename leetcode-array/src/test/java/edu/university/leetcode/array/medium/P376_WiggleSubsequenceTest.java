package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P376_WiggleSubsequenceTest {
    P376_WiggleSubsequence test = new P376_WiggleSubsequence();
    @Test
    public void wiggleMaxLength() {
        assertEquals(6, test.wiggleMaxLength(new int[]{1, 7, 4, 9, 2, 5}));
        assertEquals(7, test.wiggleMaxLength(new int[]{1, 17, 5, 10, 13, 15, 10, 5, 16, 8}));
        assertEquals(2, test.wiggleMaxLength(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
}