package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P62_UniquePathsTest {
    @Test
    public void uniquePaths1() throws Exception {
        assertEquals(3, P62_UniquePaths.uniquePaths(3, 2));
    }

    @Test
    public void uniquePaths2() throws Exception {
        assertEquals(28, P62_UniquePaths.uniquePaths(7, 3));
    }

}