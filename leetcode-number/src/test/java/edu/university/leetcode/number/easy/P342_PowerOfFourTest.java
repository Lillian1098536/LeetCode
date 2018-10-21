package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P342_PowerOfFourTest {
    @Test
    public void isPowerOfFourTrue() throws Exception {
        assertTrue(P342_PowerOfFour.isPowerOfFour(16));
    }

    @Test
    public void isPowerOfFourFalse() throws Exception {
        assertTrue(!P342_PowerOfFour.isPowerOfFour(5));
    }

}