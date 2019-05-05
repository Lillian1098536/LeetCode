package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P447_NumberOfBoomerangsTest {

    @Test
    public void numberOfBoomerangs() {
        int[][] points = new int[][]{new int[]{0, 0}, new int[]{1, 0}, new int[]{2, 0}};
        assertEquals(2, P447_NumberOfBoomerangs.numberOfBoomerangs(points));
    }
}