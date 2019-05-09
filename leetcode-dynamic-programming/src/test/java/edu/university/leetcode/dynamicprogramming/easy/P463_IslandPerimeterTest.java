package edu.university.leetcode.dynamicprogramming.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P463_IslandPerimeterTest {

    @Test
    public void islandPerimeter() {
        int[][] grid = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        assertEquals(16, P463_IslandPerimeter.islandPerimeter(grid));
    }

}