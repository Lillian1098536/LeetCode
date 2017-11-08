package edu.university.leetcode.number;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(value = JUnit4.class)
public class P4_MedianTwoSortedArraysTest {

    @Test
    public void findMedianSortedArrays1() throws Exception {
        int [] nums1 = {1, 3},  nums2 = {2};
        double result = P4_MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.0, result, 0.1);
    }

    @Test
    public void findMedianSortedArrays2() throws Exception {
        int [] nums1 = {1, 12, 15, 26, 38},  nums2 = {2, 13, 17, 30, 45};
        double result = P4_MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        assertEquals(16.0, result, 0.1);
    }

    @Test
    public void findMedianSortedArrays3() throws Exception {
        int [] nums1 = {1, 12, 15, 26, 38},  nums2 = {2, 13, 16, 17, 30, 45};
        double result = P4_MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        assertEquals(16.0, result, 0.1);
    }

    @Test
    public void findMedianSortedArrays4() throws Exception {
        int [] nums1 = {1, 12, 15, 26, 38},  nums2 = {2, 13, 17, 30, 45};
        double result = P4_MedianTwoSortedArrays.findMedianSortedArraysRecursive(nums1, nums2);
        assertEquals(16.0, result, 0.1);
    }

    @Test
    public void findMedianSortedArrays5() throws Exception {
        int [] nums1 = {1, 12, 15, 26, 38},  nums2 = {2, 13, 16, 17, 30, 45};
        double result = P4_MedianTwoSortedArrays.findMedianSortedArraysRecursive(nums1, nums2);
        assertEquals(16.0, result, 0.1);
    }
}