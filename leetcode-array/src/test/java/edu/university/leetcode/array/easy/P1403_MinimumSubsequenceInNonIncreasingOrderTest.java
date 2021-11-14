package edu.university.leetcode.array.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class P1403_MinimumSubsequenceInNonIncreasingOrderTest {
    P1403_MinimumSubsequenceInNonIncreasingOrder test = new P1403_MinimumSubsequenceInNonIncreasingOrder();
    @Test
    public void minSubsequence() {
        List<Integer> expected1 = Arrays.asList(10, 9);
        assertEquals(expected1, test.minSubsequence(new int[]{4, 3, 10, 9, 8}));
        List<Integer> expected2 = Arrays.asList(7, 7, 6);
        assertEquals(expected2, test.minSubsequence(new int[]{4, 4, 7, 6, 7}));
        List<Integer> expected3 = Arrays.asList(6);
        assertEquals(expected3, test.minSubsequence(new int[]{6}));
    }
}