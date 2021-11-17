package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1827_MinimumOperationsToMakeTheArrayIncreasingTest {
    P1827_MinimumOperationsToMakeTheArrayIncreasing test = new P1827_MinimumOperationsToMakeTheArrayIncreasing();
    @Test
    public void minOperations() {
        assertEquals(3, test.minOperations(new int[]{1, 1, 1}));
        assertEquals(14, test.minOperations(new int[]{1,5,2,4,1}));
        assertEquals(0, test.minOperations(new int[]{8}));
    }
}