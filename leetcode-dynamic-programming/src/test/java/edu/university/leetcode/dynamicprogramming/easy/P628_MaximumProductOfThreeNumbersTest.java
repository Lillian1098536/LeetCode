package edu.university.leetcode.dynamicprogramming.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P628_MaximumProductOfThreeNumbersTest {

    @Test
    public void maximumProduct() {
        int[] nums = {1, 2, 3, -7, 8, -1, 0};
        int result = P628_MaximumProductOfThreeNumbers.maximumProduct(nums);
        assertEquals(56, result);
    }
}