package edu.university.leetcode.array.hard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 41. First Missing Positive
 * Given an unsorted integer array nums, find the smallest missing positive integer.
 * Follow up: Could you implement an algorithm that runs in O(n) time and uses constant extra space.?
 * Example 1: Input: nums = [1,2,0] Output: 3
 * Example 2: Input: nums = [3,4,-1,1] Output: 2
 * Example 3: Input: nums = [7,8,9,11,12] Output: 1
 * Constraints:
 * 0 <= nums.length <= 300
 * -231 <= nums[i] <= 231 - 1
 */
public class P41_FirstMissingPositive {

    private static final Logger LOG = LoggerFactory.getLogger(P41_FirstMissingPositive.class);

    public int firstMissingPositive(int[] nums) {
        LOG.info("nums = {}", nums);
        bucketSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                LOG.info("nums[{}] = {} != {}", i , nums[i], i + 1);
                LOG.info("result = i + 1 = {}", i + 1);
                return i + 1;
            }
        }
        LOG.info("result = nums.length + 1 = {}", nums.length + 1);
        return nums.length + 1;
    }
    private static void bucketSort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            LOG.info("i => {} nums[{}] = {}", i, i, nums[i]);
            while (nums[i] != i + 1) {
                LOG.info("while i = {}", i);
                if (nums[i] < 1 || nums[i] > len || nums[i] == nums[nums[i] - 1]) {
                    LOG.info("break");
                    if (nums[i] > 0 && nums[i] <= len && nums[i] == nums[nums[i] - 1]) {
                        LOG.info("break: nums[{}] = {} nums[nums[{}}] - 1] = {}", i, nums[i], i , nums[nums[i] - 1]);
                    }
                    break;
                }
                int tmp = nums[i];
                LOG.info("nums[{}] = {}", i, nums[i]);
                LOG.info("tmp = {}", tmp);
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;
                LOG.info("nums = {}", nums);
            }
        }
    }
}
