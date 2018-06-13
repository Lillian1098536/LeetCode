package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P326_PowerOfThreeTest {
    @Test
    public void isPowerOfThree1() throws Exception {
        assertTrue(P326_PowerOfThree.isPowerOfThree(27));
    }

    @Test
    public void isPowerOfThree2() throws Exception {
        assertTrue(P326_PowerOfThree.isPowerOfThree(243));
    }
}