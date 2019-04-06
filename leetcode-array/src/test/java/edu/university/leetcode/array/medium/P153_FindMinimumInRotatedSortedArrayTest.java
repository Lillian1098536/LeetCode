package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P153_FindMinimumInRotatedSortedArrayTest {

    @Test
    public void findMin() {
        int result = P153_FindMinimumInRotatedSortedArray.findMin(new int[]{4, 5, 6, 7, 0, 1, 2});
        assertEquals(0, result);
    }
}