package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P349_IntersectionOfTwoArraysTest {

    @Test
    public void intersection() {
        int[] result = P349_IntersectionOfTwoArrays.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        int[] expected = new int[]{4, 9};
        assertArrayEquals(expected, result);
    }

}