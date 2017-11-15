package edu.university.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class P8_StringtoIntegerAtoiTest {

    @Test
    public void myAtoi1() throws Exception {
        int expected = 123;
        int result = P8_StringtoIntegerAtoi.myAtoi("123");
        assertEquals(expected, result);
    }

    @Test
    public void myAtoi2() throws Exception {
        int expected = -123;
        int result = P8_StringtoIntegerAtoi.myAtoi("-123");
        assertEquals(expected, result);
    }

}