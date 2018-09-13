package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1000_SearchForARangeTest {
    @Test
    public void searchRange1() throws Exception {
        int[] expected = new int[]{3, 4};
        int[] result = P1000_SearchForARange.searchRange(new int[]{5,7,7,8,8,10}, 8);
        assertArrayEquals(expected, result);
    }
    @Test
    public void searchRange2() throws Exception {
        int[] expected = new int[]{-1, -1};
        int[] result = P1000_SearchForARange.searchRange(new int[]{5,7,7,8,8,10}, 6);
        assertArrayEquals(expected, result);
    }
    @Test
    public void searchRange3() throws Exception {
        int[] expected = new int[]{5, 5};
        int[] result = P1000_SearchForARange.searchRange(new int[]{5,7,7,8,8,10}, 10);
        assertArrayEquals(expected, result);
    }

}