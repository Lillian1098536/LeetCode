package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P91_DecodeWaysTest {
    P91_DecodeWays test = new P91_DecodeWays();
    @Test
    public void numDecoding() {
        assertEquals(2, test.numDecoding("12"));
        assertEquals(3, test.numDecoding("226"));
        assertEquals(0, test.numDecoding("0"));
        assertEquals(0, test.numDecoding("06"));
    }
}