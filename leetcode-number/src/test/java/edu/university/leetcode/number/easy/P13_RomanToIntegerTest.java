package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P13_RomanToIntegerTest {
    @Test
    public void romanToInt1() throws Exception {
        int result = P13_RomanToInteger.romanToInt("IV");
        assertEquals(4, result);
    }

    @Test
    public void romanToInt2() throws Exception {
        int result = P13_RomanToInteger.romanToInt("VI");
        assertEquals(6, result);
    }

    @Test
    public void romanToInteger3() throws Exception {
        int result = P13_RomanToInteger.romanToInteger("IV");
        assertEquals(4, result);
    }

    @Test
    public void romanToInteger4() throws Exception {
        int result = P13_RomanToInteger.romanToInteger("VI");
        assertEquals(6, result);
    }

}