package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P69_SqrtXTest {
    P69_SqrtX test = new P69_SqrtX();
    @Test
    public void mySqrt1() throws Exception {
        int result = test.mySqrt(4);
        assertEquals(2, result);
    }

    @Test
    public void mySqrt2() throws Exception {
        int result = test.mySqrt(8);
        assertEquals(2, result);
    }

    @Test
    public void mySqrt3() throws Exception {
        int result = test.mySqrt(2);
        assertEquals(1, result);
    }

}