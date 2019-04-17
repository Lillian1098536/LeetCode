package edu.university.leetcode.array.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations
 * Given a collection of distinct integers, return all possible permutations.
 * Example: Input: [1,2,3] Output:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 */
public class P46_Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteRecursive(result, nums, 0);
        return result;
    }

    private void permuteRecursive(List<List<Integer>> result, int[] nums, int index) {
        int len = nums.length;
        if (index == len - 1) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < len; tmp.add(nums[i++]));
            result.add(tmp);
            return;
        }
        for (int i = index; i < len; i++) {
            swap(nums, index, i);
            permuteRecursive(result, nums, index + 1);
            swap(nums, i, index);
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (nums[i] != nums[j]) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

}
