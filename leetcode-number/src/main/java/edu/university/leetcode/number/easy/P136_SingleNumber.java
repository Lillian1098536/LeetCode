package edu.university.leetcode.number.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 136. Single Number
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
@Slf4j
public class P136_SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n;
            log.debug("result = {}", result);
        }
        return result;
    }

}
