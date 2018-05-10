package edu.university.leetcode.number.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P12_IntegerToRomanTest {
    @Test
    public void intToRoman1() throws Exception {
        String result = P12_IntegerToRoman.intToRoman(58);
        assertEquals("LVIII", result);
    }

    @Test
    public void intToRoman2() throws Exception {
        String result = P12_IntegerToRoman.intToRoman(1994);
        assertEquals("MCMXCIV", result);
    }

}