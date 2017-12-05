package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P88_MergeSortedArrayTest {

    @Test
    public void merge() throws Exception {
        int[] nums1 = {1, 5, 9, 0, 0, 0, 0}, nums2 = {2, 3, 4, 10};
        int[] expected = {1, 2, 3, 4, 5, 9, 10};
        int[] result = P88_MergeSortedArray.merge(nums1, 3, nums2, 4);
        assertArrayEquals(expected, result);
    }

}