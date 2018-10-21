package edu.university.leetcode.binary.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 326. Power of Three
 * Given an integer, write a function to determine if it is a power of three.
 * Example 1: Input: 27 Output: true
 * Example 2: Input: 0 Output: false
 * Example 3: Input: 243 Output: true
 */
@Slf4j
public class P326_PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        log.info("power = {}", Math.log(n) / Math.log(3));
        return (Math.log(n) / Math.log(3)) % 1 == 0;
    }

}
