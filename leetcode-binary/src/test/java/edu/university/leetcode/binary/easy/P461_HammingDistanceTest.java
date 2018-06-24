package edu.university.leetcode.binary.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P461_HammingDistanceTest {
    @Test
    public void hammingDistance1() throws Exception {
        assertEquals(2, P461_HammingDistance.hammingDistance(1, 4));
    }

    @Test
    public void hammingDistance2() throws Exception {
        assertEquals(1, P461_HammingDistance.hammingDistance(3, 1));
    }
}