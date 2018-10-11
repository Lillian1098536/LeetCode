package edu.university.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. Combination Sum
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target),
 * find all unique combinations in candidates where the candidate numbers sums to target.
 * The same repeated number may be chosen from candidates unlimited number of times.
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1: Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 *  [7],
 *  [2,2,3]
 * ]
 * Example 2: Input: candidates = [2,3,5], target = 8,
 * A solution set is:
 * [
 *  [2,2,2,2],
 *  [2,3,3],
 *  [3,5]
 * ]
 */
public class P39_CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }
        Arrays.sort(candidates);

        backTrack(candidates, target, result, new ArrayList<>(), 0);

        return result;
    }

    private static void backTrack(int[] nums, int target, List<List<Integer>> result, ArrayList<Integer> list, int start) {
        if (target < 0) return;;
        if (target == 0) {
            result.add(list);
            return;
        }
        for (int i = start; i < nums.length && nums[i] <= target; i++) {
            list.add(nums[i]);
            backTrack(nums, target - nums[i], result, new ArrayList<>(list), i);
            list.remove(list.size() - 1);
        }
    }

}
