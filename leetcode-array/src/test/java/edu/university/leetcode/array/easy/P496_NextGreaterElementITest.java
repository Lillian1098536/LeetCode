package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P496_NextGreaterElementITest {

    @Test
    public void nextGreaterElement1() {
        assertArrayEquals(new int[]{-1, 3, -1}, P496_NextGreaterElementI.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
    }

    @Test
    public void nextGreaterElement2() {
        assertArrayEquals(new int[]{3, -1}, P496_NextGreaterElementI.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
    }

}