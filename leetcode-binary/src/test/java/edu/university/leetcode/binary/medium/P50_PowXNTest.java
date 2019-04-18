package edu.university.leetcode.binary.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P50_PowXNTest {

    @Test
    public void myPow() {
        assertEquals(1024.00000, P50_PowXN.myPow(2.00000, 10), 5);
    }

    @Test
    public void myPow1() {
        assertEquals(0.25000, P50_PowXN.myPow(2.00000, -2), 5);
    }

    @Test
    public void myPow2() {
        assertEquals(1024.00000, P50_PowXN.myPow2(2.00000, 10), 5);
    }

    @Test
    public void myPow3() {
        assertEquals(0.25000, P50_PowXN.myPow2(2.00000, -2), 5);
    }

    @Test
    public void myPow4() {
        assertEquals(1.00000, P50_PowXN.myPow2(1.00000, -2147483648), 5);
    }
}