package edu.university.leetcode.dynamicprogramming.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1646_GetMaximumInGeneratedArrayTest {
    P1646_GetMaximumInGeneratedArray test = new P1646_GetMaximumInGeneratedArray();
    @Test
    public void getMaximumGenerated() {
        assertEquals(0, test.getMaximumGenerated(0));
        assertEquals(1, test.getMaximumGenerated(1));
        assertEquals(1, test.getMaximumGenerated(2));
        assertEquals(3, test.getMaximumGenerated(7));
        assertEquals(4, test.getMaximumGenerated(10));
        assertEquals(13, test.getMaximumGenerated(60));
    }
}