package edu.university.leetcode.number.medium;

import java.util.Random;

/**
 * 384. Shuffle an Array
 * Shuffle a set of numbers without duplicates.
 * Example: Init an array with set 1, 2, and 3. int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 * Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
 * solution.shuffle();
 * Resets the array back to its original configuration [1,2,3].
 * solution.reset();
 * Returns the random shuffling of array [1,2,3].
 * solution.shuffle();
 */
public class P384_ShuffleAnArray {

    private int[] nums;
    private Random random;

    public P384_ShuffleAnArray(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if (nums == null || nums.length == 0) return null;
        int[] copy = (int[])nums.clone();
        for (int i = 0; i < nums.length; i++) {
            int j = random.nextInt(i + 1);
            swap(copy, i, j);
        }
        return copy;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
