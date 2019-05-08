package edu.university.leetcode.dynamicprogramming.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestPathTest {

    @Test
    public void findShortestPath() {
        int[][] m = new int[][]{{0, 0, 0, 1, 0}, {0, 0, 1, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        assertEquals(8, ShortestPath.findShortestPath(m));
    }

}