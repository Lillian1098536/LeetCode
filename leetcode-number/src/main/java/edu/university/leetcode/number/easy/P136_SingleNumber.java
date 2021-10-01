package edu.university.leetcode.number.easy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 136. Single Number
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class P136_SingleNumber {
    private final static Logger LOG = LoggerFactory.getLogger(P136_SingleNumber.class);
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n;
            LOG.info("result = {}", result);
        }
        return result;
    }

}
