package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P350_IntersectionOfTwoArraysIITest {
    @Test
    public void intersect() throws Exception {
        int[] nums1 = new int[]{-2147483648, 1, 2, 3};
        int[] nums2 = new int[]{1, -2147483648, -2147483648};
        int[] result = P350_IntersectionOfTwoArraysII.intersect(nums1, nums2);
        int[] expected = new int[]{1, -2147483648};
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }

}