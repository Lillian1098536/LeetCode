package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1005_MaximizeSumOfArrayAfterKNegationsTest {
    P1005_MaximizeSumOfArrayAfterKNegations test = new P1005_MaximizeSumOfArrayAfterKNegations();
    @Test
    public void largestSumAfterKNegations() {
        assertEquals(5, test.largestSumAfterKNegations(new int[]{4, 2, 3}, 1));
        assertEquals(6, test.largestSumAfterKNegations(new int[]{3,-1,0,2}, 3));
        assertEquals(13, test.largestSumAfterKNegations(new int[]{2,-3,-1,5,-4}, 2));
    }
}