package edu.university.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 47. Permutations II
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * Example: Input: [1,1,2] Output:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 */
public class P47_PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        ArrayList<Integer> tmp = new ArrayList<>();
        Arrays.sort(nums);
        permuteRecursive(result, nums, tmp, flag);
        return result;
    }

    private void permuteRecursive(List<List<Integer>> result, int[] nums, ArrayList<Integer> tmp, boolean[] flag) {
        int len = nums.length;
        if (tmp.size() == len) {
            result.add((List<Integer>)tmp.clone());
            return;
        }
        for (int i = 0; i < len; i++) {
            // P 46 no need to check duplicate
            if (flag[i] || i > 0 && nums[i] == nums[i - 1] && !flag[i - 1]) continue;
            flag[i] = true;
            tmp.add(nums[i]);
            permuteRecursive(result, nums, tmp, flag);
            tmp.remove(tmp.size() - 1);
            flag[i] = false;
        }
    }
}
