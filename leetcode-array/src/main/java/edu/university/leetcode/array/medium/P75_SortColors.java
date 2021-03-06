package edu.university.leetcode.array.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 75. Sort Colors
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent,
 * with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * Note: You are not suppose to use the library's sort function for this problem.
 * Example: Input: [2,0,2,1,1,0] Output: [0,0,1,1,2,2]
 */
public class P75_SortColors {

    private static final Logger LOG = LoggerFactory.getLogger(P75_SortColors.class);

    public static void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1, i = 0;
        while (i <= right) {
            LOG.info("i = {} nums = {}", i, nums);
            if (nums[i] == 0) {
                int tmp = nums[i];
                nums[i++] = nums[left];
                nums[left++] = tmp;
                LOG.info("tmp = {} left = {}", tmp, left);
            } else if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                int tmp = nums[i];
                nums[i] = nums[right];
                nums[right--] = tmp;
                LOG.info("tmp = {} right = {}", tmp, right);
            }
        }
    }

    /**
     * bucket sort
     */
    public static void sortColorsTwoPass(int[] nums) {
        int[] ct = new int[3];

        for(int n : nums){
            ct[n]++;
        }

        ct[1] += ct[0];
        ct[2] += ct[1];

        LOG.info("ct[0] = {}", ct[0]);
        LOG.info("ct[1] = {}", ct[1]);
        LOG.info("ct[2] = {}", ct[2]);

        for(int i = 0; i < ct[0]; i++){
            nums[i] = 0;
        }

        for(int i = ct[0]; i < ct[1]; i++){
            nums[i] = 1;
        }

        for(int i = ct[1]; i < nums.length; i++){
            nums[i] = 2;
        }
    }

}
