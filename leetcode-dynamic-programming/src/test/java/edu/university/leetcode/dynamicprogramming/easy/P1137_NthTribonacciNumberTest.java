package edu.university.leetcode.dynamicprogramming.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1137_NthTribonacciNumberTest {
    P1137_NthTribonacciNumber test = new P1137_NthTribonacciNumber();
    @Test
    public void tribonacci() {
        assertEquals(2, test.tribonacci(3));
        assertEquals(4, test.tribonacci(4));
        assertEquals(755476, test.tribonacci(24));
        assertEquals(1389537, test.tribonacci(25));
    }
}