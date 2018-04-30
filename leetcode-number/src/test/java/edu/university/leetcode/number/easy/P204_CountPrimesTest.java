package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P204_CountPrimesTest {
    @Test
    public void countPrimes1() throws Exception {
        int result = P204_CountPrimes.countPrimes(10);
        assertEquals(4, result);
    }

    @Test
    public void countPrimes2() throws Exception {
        int result = P204_CountPrimes.count(3);
        assertEquals(1, result);
    }

    @Test
    public void countPrimes3() throws Exception {
        int result = P204_CountPrimes.count(100);
        assertEquals(25, result);
    }

}