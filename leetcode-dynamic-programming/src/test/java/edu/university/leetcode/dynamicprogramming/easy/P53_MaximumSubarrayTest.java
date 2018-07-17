package edu.university.leetcode.dynamicprogramming.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P53_MaximumSubarrayTest {

    @Test
    public void maxSubArray1() throws Exception {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = P53_MaximumSubarray.maxSubArray(nums);
        assertEquals(6, result);
    }

    @Test
    public void maxSubArray2() throws Exception {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = P53_MaximumSubarray.maxSub(nums);
        assertEquals(6, result);
    }

}