package edu.university.leetcode.array.medium;

import lombok.extern.slf4j.Slf4j;

/**
 * 31. Next Permutation
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 * The replacement must be in-place and use only constant extra memory.
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */
@Slf4j
public class P31_NextPermutation {

    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int i = nums.length - 2;
        while (i >= 0 && nums[i] > nums[i + 1]) i--;
        if (i >= 0) {
            log.info("i = {}", i);
            int j = i + 1;
            while (j < nums.length && nums[j] > nums[i]) {
                j++;
                log.info("j = {}", j);
            }
            j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }
}
