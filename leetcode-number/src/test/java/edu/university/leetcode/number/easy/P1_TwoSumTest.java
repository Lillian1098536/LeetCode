package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1_TwoSumTest {
    @Test
    public void getTwoSumNumbers() throws Exception {
        int[] test = {2, 7, 11, 13};
        int target = 9;
        int[] result = P1_TwoSum.getTwoSumNumbers(test, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void getTwoSum() throws Exception {
        int[] test = {3, 2, 4};
        int target = 6;
        int[] result = P1_TwoSum.twoSum(test, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

}