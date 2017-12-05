package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P69_SqrtXTest {

    @Test
    public void mySqrt1() throws Exception {
        int result = P69_SqrtX.mySqrt(4);
        assertEquals(2, result);
    }

    @Test
    public void mySqrt2() throws Exception {
        int result = P69_SqrtX.mySqrt(8);
        assertEquals(2, result);
    }

    @Test
    public void mySqrt3() throws Exception {
        int result = P69_SqrtX.mySqrt(0);
        assertEquals(0, result);
    }

}