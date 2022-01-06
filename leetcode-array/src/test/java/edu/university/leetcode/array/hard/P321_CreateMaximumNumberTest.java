package edu.university.leetcode.array.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class P321_CreateMaximumNumberTest {
    P321_CreateMaximumNumber test = new P321_CreateMaximumNumber();
    @Test
    public void maxNumber() {
        int[] expected1 = new int[]{9, 8, 6, 5, 3};
        int[] result1 = test.maxNumber(new int[]{3, 4, 6, 5}, new int[]{9, 1, 2, 5, 8, 3}, 5);
        assertArrayEquals(expected1, result1);
        int[] expected2 = new int[]{6, 7, 6, 0, 4};
        int[] result2 = test.maxNumber(new int[]{6, 7}, new int[]{6, 0, 4}, 5);
        assertArrayEquals(expected2, result2);
        int[] expected3 = new int[]{9, 8, 9};
        int[] result3 = test.maxNumber(new int[]{3, 9}, new int[]{8, 9}, 3);
        assertArrayEquals(expected3, result3);
    }
}