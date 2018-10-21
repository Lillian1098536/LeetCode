package edu.university.leetcode.binary.easy;

/**
 * 231. Power of Two
 * Given an integer, write a function to determine if it is a power of two.
 */
public class P231_PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

}
