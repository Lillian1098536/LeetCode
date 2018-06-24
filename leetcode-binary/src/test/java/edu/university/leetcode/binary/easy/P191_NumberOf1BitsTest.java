package edu.university.leetcode.binary.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P191_NumberOf1BitsTest {
    @Test
    public void hammingWeight1() throws Exception {
        assertEquals(3, P191_NumberOf1Bits.hammingWeight(11));
    }

    @Test
    public void hammingWeight2() throws Exception {
        assertEquals(1, P191_NumberOf1Bits.hammingWeight(128));
    }
}