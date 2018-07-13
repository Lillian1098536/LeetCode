package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P300_LongestIncreasingSubsequenceTest {
    @Test
    public void lengthOfLIS() throws Exception {
        int[] input = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, P300_LongestIncreasingSubsequence.lengthOfLIS(input));
    }

}