package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P605_CanPlaceFlowersTest {
    P605_CanPlaceFlowers test = new P605_CanPlaceFlowers();
    @Test
    public void canPlaceFlowers() {
        assertTrue(test.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        assertFalse(test.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }
}