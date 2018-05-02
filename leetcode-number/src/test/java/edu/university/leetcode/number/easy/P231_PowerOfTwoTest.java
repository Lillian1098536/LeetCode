package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P231_PowerOfTwoTest {
    @Test
    public void isPowerOfTwo1() throws Exception {
        assertTrue(P231_PowerOfTwo.isPowerOfTwo(1));
    }

    @Test
    public void isPowerOfTwo2() throws Exception {
        assertTrue(P231_PowerOfTwo.isPowerOfTwo(4));
    }

    @Test
    public void isPowerOfTwo3() throws Exception {
        assertTrue(P231_PowerOfTwo.isPowerOfTwo(256));
    }

}