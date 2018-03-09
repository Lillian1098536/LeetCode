package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P7_ReverseIntegerTest {

    @Test
    public void reverse1() throws Exception {
        int result = P7_ReverseInteger.reverse(123);
        assertEquals(321, result);
    }

    @Test
    public void reverse2() throws Exception {
        int result = P7_ReverseInteger.reverse(-123);
        assertEquals(-321, result);
    }

    @Test
    public void reverse3() throws Exception {
        int result = P7_ReverseInteger.reverse(120);
        assertEquals(21, result);
    }

    @Test
    public void reverse4() throws Exception {
        int result = P7_ReverseInteger.reverse(2147483647);
        assertEquals(0, result);
    }

    @Test
    public void reverse5() throws Exception {
        int result = P7_ReverseInteger.reverseInteger(2147483647);
        assertEquals(0, result);
    }

    @Test
    public void reverse6() throws Exception {
        int result = P7_ReverseInteger.reverseInteger(120);
        assertEquals(21, result);
    }

    @Test
    public void reverse7() throws Exception {
        int result = P7_ReverseInteger.reverseInteger(-2147483648);
        assertEquals(0, result);
    }

}