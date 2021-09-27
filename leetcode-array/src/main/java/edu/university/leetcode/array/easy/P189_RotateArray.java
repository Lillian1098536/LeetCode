package edu.university.leetcode.array.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 189. Rotate Array
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * Note: Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Hint: Could you do it in-place with O(1) extra space?
 */
public class P189_RotateArray {
    private static final Logger LOG = LoggerFactory.getLogger(P189_RotateArray.class);

    /**
     * Time complexity  O(N)
     * Space complexity O(1)
     */
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        rotate(nums, 0, length - 1);
        LOG.info("nums={}", nums);
        rotate(nums, 0, k - 1);
        LOG.info("nums={}", nums);
        rotate(nums, k, length - 1);
        LOG.info("nums={}", nums);
    }

    private void rotate(int[] nums, int start, int end) {
        int tmp;
        while (start < end) {
            tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }

    /**
     * n = ++i increments a and returns that value
     * n = 1, i = 1
     * while n = i++ returns a's value and then increments a
     * n = 0, i = 1
     */
    public static void rotateArray(int[] nums, int k) {
        if (nums == null || (k %= nums.length) == 0) return;
        int n = nums.length, start = 0, index = 0, pre = 0, cur = nums[0];
        for (int i = 0; i < n; ++i) {
            LOG.info("i={} nums={}", i, nums);
            pre = cur;
            index = (index + k) % n;
            cur = nums[index];
            nums[index] = pre;
            LOG.info("start={} index={} pre={} cur={}", start, index, pre, cur);
            if(index == start) {
                index = ++start;
                cur = nums[index];
                LOG.info(">>> index={} start={} cur={} nums={}", index, start, cur, nums);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateArray(nums, 3);
        P189_RotateArray test = new P189_RotateArray();
        test.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

}
