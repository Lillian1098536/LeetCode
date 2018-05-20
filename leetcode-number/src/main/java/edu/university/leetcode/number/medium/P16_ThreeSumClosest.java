package edu.university.leetcode.number.medium;

import java.util.Arrays;

/**
 * 16. 3Sum Closest
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * Example: Given array nums = [-1, 2, 1, -4], and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class P16_ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0, min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0, len = nums.length; i <= len - 3; i++) {
            int low = i + 1, high = len - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (Math.abs(target - sum) < min) {
                    min = Math.abs(target - sum);
                    result = sum;
                }
                if (target == sum) {
                    return result;
                } else if (target > sum) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return result;
    }

}
