package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P532_KdiffPairsInAnArrayTest {

    @Test
    public void findPairs0() {
        int[] nums = {1, 3, 1, 5, 4};
        assertEquals(1, P532_KdiffPairsInAnArray.findPairs(nums, 0));
    }

    @Test
    public void findPairs1() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(4, P532_KdiffPairsInAnArray.findPairs(nums, 1));
    }

    @Test
    public void findPairs2() {
        int[] nums = {3, 1, 4, 1, 5};
        assertEquals(2, P532_KdiffPairsInAnArray.findPairs(nums, 2));
    }
}