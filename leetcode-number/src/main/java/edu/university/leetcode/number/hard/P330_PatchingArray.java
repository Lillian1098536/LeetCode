package edu.university.leetcode.number.hard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 330. Patching Array
 * Given a sorted positive integer array nums and an integer n, add/patch elements to the array such that any number in range
 * [1, n] inclusive can be formed by the sum of some elements in the array. Return the minimum number of patches required.
 * Example 1: Input: nums = [1,3], n = 6
 * Output: 1
 * Explanation: Combinations of nums are [1], [3], [1,3], which form possible sums of: 1, 3, 4.
 * Now if we add/patch 2 to nums, the combinations are: [1], [2], [3], [1,3], [2,3], [1,2,3].
 * Possible sums are 1, 2, 3, 4, 5, 6, which now covers the range [1, 6].
 * So we only need 1 patch.
 * Example 2: Input: nums = [1,5,10], n = 20
 * Output: 2
 * Explanation: The two patches can be [2, 4].
 * Example 3: Input: nums = [1,2,2], n = 5
 * Output: 0
 */
public class P330_PatchingArray {
    private static final Logger LOG = LoggerFactory.getLogger(P330_PatchingArray.class);
    public int minPatches(int[] nums, int n) {
        long miss = 1;
        int count = 0, i = 0;
        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                miss += nums[i++];
                LOG.info("i={} nums[i]={} miss={}", i, nums[i - 1], miss);
            } else {
                LOG.info("else i={} miss={} count={}", i, miss, count + 1);
                miss += miss;
                count++;
            }
        }
        LOG.info("final miss={} count={}", miss, count);
        return count;
    }
}
