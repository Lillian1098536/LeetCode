package edu.university.leetcode.array.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 90. Subsets II
 * Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 * Example 1: Input: nums = [1,2,2]
 * Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
 * Example 2: Input: nums = [0]
 * Output: [[],[0]]
 * Constraints:
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 */
public class P90_SubsetsII {
    private static final Logger LOG = LoggerFactory.getLogger(P90_SubsetsII.class);
    /**
     * time complex O(2^n) space complex O(n);
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        int pre = 0;
        for (int i = 0; i < nums.length; ++i) {
            int size = result.size();
            LOG.info("i = {} pre = {} size = {} nums[{}] = {}", i, pre, size, i, nums[i]);
            for (int j = 0; j < size; ++j) {
                if (i == 0 || nums[i] != nums[i - 1] || j >= pre) {
                    result.add(new ArrayList<>(result.get(j)));
                    result.get(result.size() - 1).add(nums[i]);
                    LOG.info("j = {} list = {}", j, result.get(result.size() - 1));

                }
            }
            pre = size;
        }
        return result;
    }
}
