package edu.university.leetcode.dynamicprogramming.medium;

/**
 * 152. Maximum Product Subarray
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
 * Example 1: Input: [2,3,-2,4] Output: 6
 * Explanation: [2,3] has the largest product 6.
 * Example 2: Input: [-2,0,-1] Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */
public class P152_MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int global = nums[0], max = nums[0], min = nums[0];
        for (int n : nums) {
            int maxTmp = Math.max(max * n, min * n);
            int minTmp = Math.min(max * n, min * n);
            max = Math.max(maxTmp, n);
            min = Math.min(minTmp, n);
            global = Math.max(global, max);
        }
        return global;
    }

}
