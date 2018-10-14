package edu.university.leetcode.number.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * 219. Contains Duplicate II
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array
 * such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 * Example 1: Input: nums = [1,2,3,1], k = 3 Output: true
 * Example 2: Input: nums = [1,0,1,1], k = 1 Output: true
 * Example 3: Input: nums = [1,2,3,1,2,3], k = 2 Output: false

 */
@Slf4j
public class P219_ContainsDuplicateII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                log.info("i = {} i - k - 1 = {}", i, i - k - 1);
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) return true;
        }
        return false;
    }

}
