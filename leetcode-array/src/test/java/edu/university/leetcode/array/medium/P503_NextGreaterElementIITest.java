package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P503_NextGreaterElementIITest {

    @Test
    public void nextGreaterElements() {
        assertArrayEquals(new int[]{2, -1, 2}, P503_NextGreaterElementII.nextGreaterElements(new int[]{1, 2, 1}));
    }

}