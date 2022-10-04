package edu.university.leetcode.array.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 915. Partition Array into Disjoint Intervals
 * Given an integer array nums, partition it into two (contiguous) sub-arrays left and right so that:
 * Every element in left is less than or equal to every element in right.
 * left and right are non-empty.
 * left has the smallest possible size.
 * Return the length of left after such a partitioning.
 * Test cases are generated such that partitioning exists.
 * Example 1: Input: nums = [5,0,3,8,6] Output: 3 Explanation: left = [5,0,3], right = [8,6]
 * Example 2: Input: nums = [1,1,1,0,6,12] Output: 4 Explanation: left = [1,1,1,0], right = [6,12]
 * Constraints:
 * 2 <= nums.length <= 105
 * 0 <= nums[i] <= 106
 * There is at least one valid answer for the given input.
 */
public class P915_PartitionArrayIntoDisjointIntervals {
    private static final Logger LOG = LoggerFactory.getLogger(P915_PartitionArrayIntoDisjointIntervals.class);

    public int partitionDisjoint(int[] nums) {
        int len = nums.length, max = nums[0], leftMax = nums[0], pos = 0;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] >= leftMax) {
                continue;
            }
            LOG.info("num[i] < leftMax, put num[{}]={} to left", i, nums[i]);
            leftMax = max;
            pos = i;
            LOG.info("leftMax={} pos={}", leftMax, pos);
        }
        LOG.info(">>>>>> result={}", pos + 1);
        return pos + 1;
    }
}
