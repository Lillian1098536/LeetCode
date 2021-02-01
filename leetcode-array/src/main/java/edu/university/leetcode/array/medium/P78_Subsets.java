package edu.university.leetcode.array.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 * Example 1: Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * Example 2: Input: nums = [0]
 * Output: [[],[0]]
 * Constraints:
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * All the numbers of nums are unique.
 */
public class P78_Subsets {
    private static final Logger LOG = LoggerFactory.getLogger(P78_Subsets.class);
    /**
     * brute-force attack / exhaustive key search
     * time complex O(2^n) space complex O(n)
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subset(nums, list, 0, result);
        return result;
    }

    private static void subset(int[] nums, List<Integer> list, int step, List<List<Integer>> result) {
        if (step == nums.length) {
            result.add(new ArrayList<>(list));
            LOG.info("                step = {} add list = {}", step, list);
            return;
        }
        LOG.info("step = {}", step);
        subset(nums, list, step + 1, result);
        LOG.info("add nums[{}] = {} to list", step, nums[step]);
        list.add(nums[step]);
        subset(nums, list, step + 1, result);
        LOG.info("remove list last index = {}", list);
        list.remove(list.size() - 1);
    }
}
