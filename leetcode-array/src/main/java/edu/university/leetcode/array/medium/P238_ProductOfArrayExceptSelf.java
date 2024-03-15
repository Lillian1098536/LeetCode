package edu.university.leetcode.array.medium;

import java.util.Arrays;

/**
 * 238. Product of Array Except Self
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * Example 1: Input: nums = [1,2,3,4] Output: [24,12,8,6]
 * Example 2: Input: nums = [-1,1,0,-3,3] Output: [0,0,9,0,0]
 * Constraints:
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 */
public class P238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length, tmp = 1;
        if (len == 0) {
            return new int[0];
        }
        int[] ans = new int[len];
        ans[0] = 1;
        for (int i = 1; i < len; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        for (int i = len - 2; i >= 0; i--) {
            tmp *= nums[i + 1];
            ans[i] *= tmp;
        }
        return ans;
    }

    public static void main(String[] args) {
        P238_ProductOfArrayExceptSelf test = new P238_ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(test.productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
