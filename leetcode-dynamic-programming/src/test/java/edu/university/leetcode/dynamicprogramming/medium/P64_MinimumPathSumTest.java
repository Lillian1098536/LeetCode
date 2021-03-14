package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P64_MinimumPathSumTest {

    P64_MinimumPathSum test = new P64_MinimumPathSum();

    @Test
    public void minPathSum() {
        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        assertEquals(7, test.minPathSum(grid));
    }
}