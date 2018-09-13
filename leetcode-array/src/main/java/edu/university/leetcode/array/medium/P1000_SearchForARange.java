package edu.university.leetcode.array.medium;

/**
 * Search for a Range
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * Example 1: Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4]
 * Example 2: Input: nums = [5,7,7,8,8,10], target = 6 Output: [-1,-1]
 */
public class P1000_SearchForARange {

    public static int[] searchRange(int[] nums, int target) {
        int[] ct = new int[nums.length];
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                ct[++index] = i;
            }
        }
        if (index == -1) {
            return new int[]{-1, -1};
        } else if (index == 0) {
            return new int[]{ct[0], ct[0]};
        }
        return new int[]{ct[0], ct[index]};
    }

}
