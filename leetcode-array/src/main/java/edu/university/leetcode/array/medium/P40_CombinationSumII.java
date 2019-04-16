package edu.university.leetcode.array.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 40. Combination Sum II
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 * Each number in candidates may only be used once in the combination.
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1: Input: candidates = [10,1,2,7,6,1,5], target = 8,
 * A solution set is:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 * Example 2: Input: candidates = [2,5,2,1,2], target = 5,
 * A solution set is:
 * [
 * [1,2,2],
 * [5]
 * ]
 */
@Slf4j
public class P40_CombinationSumII {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length < 0) {
            return result;
        }
        Arrays.sort(candidates);
        backTrack(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }

    private static void backTrack(int[] nums, int target, List<List<Integer>> result, ArrayList<Integer> list, int start) {
        log.info("start = {}", start);
        if (target == 0) {
            result.add(new ArrayList<>(list));
            log.info("add list = {}", list);
            return;
        }
        for (int i = start; i < nums.length && target >= nums[i]; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue;
            list.add(nums[i]);
            backTrack(nums, target - nums[i], result, list, i + 1);
            list.remove(list.size() - 1);
        }
    }

}
