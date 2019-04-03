package edu.university.leetcode.dynamicprogramming.medium;

import edu.university.leetcode.dynamicprogramming.easy.P53_MaximumSubarray;
import org.junit.Test;

import static org.junit.Assert.*;

public class P152_MaximumProductSubarrayTest {

    @Test
    public void maxProduct() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = P152_MaximumProductSubarray.maxProduct(nums);
        assertEquals(960, result);
    }

}