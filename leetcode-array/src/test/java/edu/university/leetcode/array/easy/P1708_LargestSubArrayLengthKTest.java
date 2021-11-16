package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P1708_LargestSubArrayLengthKTest {
    P1708_LargestSubArrayLengthK test = new P1708_LargestSubArrayLengthK();

    @Test
    public void largestSubArray() {
        int[] expected1 = new int[]{5, 2, 3}, result1 = test.largestSubArray(new int[]{1, 4, 5, 2, 3}, 3);
        for (int i = 0; i < expected1.length; i++) {
            assertEquals(expected1[i], result1[i]);
        }
        int[] expected2 = new int[]{4, 5, 2, 3}, result2 = test.largestSubArray(new int[]{1, 4, 5, 2, 3}, 4);
        for (int i = 0; i < expected2.length; i++) {
            assertEquals(expected2[i], result2[i]);
        }
        int[] expected3 = new int[]{5}, result3 = test.largestSubArray(new int[]{1, 4, 5, 2, 3}, 1);
        assertEquals(expected3[0], result3[0]);
    }
}