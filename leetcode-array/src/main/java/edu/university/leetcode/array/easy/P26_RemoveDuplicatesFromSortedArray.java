package edu.university.leetcode.array.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 26. Remove Duplicates from Sorted Array
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * Example:
 * Given nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 */
@Slf4j
public class P26_RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int newLength = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[newLength] != nums[i]) {
                nums[++newLength] = nums[i];
            }
            log.debug("i={} newLength={} nums={}", i, newLength, nums);
        }
        return newLength + 1;
    }

}
