package edu.university.leetcode.binary.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P190_ReverseBitsTest {
    @Test
    public void reverseBits1() throws Exception {
        int result = P190_ReverseBits.reverseBits(1);
        assertEquals(-2147483648, result);
    }

    @Test
    public void reverseBits2() throws Exception {
        int result = P190_ReverseBits.reverseBits(43261596);
        assertEquals(964176192, result);
    }
}