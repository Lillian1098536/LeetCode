package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P836_RectangleOverlapTest {

    @Test
    public void isRectangleOverlapTrue() {
        assertTrue(P836_RectangleOverlap.isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}));
    }

    @Test
    public void isRectangleOverlapFalse() {
        assertTrue(!P836_RectangleOverlap.isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{2, 2, 3, 3}));
    }
}