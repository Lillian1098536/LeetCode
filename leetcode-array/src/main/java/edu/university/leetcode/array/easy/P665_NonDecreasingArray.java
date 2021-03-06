package edu.university.leetcode.array.easy;

/**
 * 665. Non-decreasing Array
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 * Example 1: Input: [4,2,3] Output: True
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 * Example 2: Input: [4,2,1] Output: False
 * Explanation: You can't get a non-decreasing array by modify at most one element.
 */
public class P665_NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        if (nums == null) return false;
        boolean change = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                continue;
            } else {
                if (!change) {
                    change = true;
                    if (i == 0) {
                        nums[i] = nums[i + 1];
                    } else if (nums[i - 1] > nums[i + 1]) {
                        nums[i + 1] = nums[i];
                    } else {
                        nums[i] = nums[i - 1];
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
