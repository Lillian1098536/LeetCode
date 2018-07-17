package edu.university.leetcode.dynamicprogramming.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 53. Maximum Subarray
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * Example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
@Slf4j
public class P53_MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int sum = 0, min = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            log.debug("i={} sum={} max={} min={}", i, sum, max, min);
            max = Math.max(max, sum - min);
            min = Math.min(min, sum);
            log.debug("after max={} min={}", max, min);
        }
        return max;
    }

    public static int maxSub(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int n : nums) {
            log.debug("sum={} max={}", sum, max);
            if (sum < 0) {
                sum = 0;
            }
            sum += n;
            max = Math.max(max, sum);
            log.debug("after max={}", max);
        }
        return max;
    }

}

