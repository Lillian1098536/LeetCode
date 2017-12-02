package edu.university.leetcode.number.easy;

import lombok.extern.slf4j.Slf4j;

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
