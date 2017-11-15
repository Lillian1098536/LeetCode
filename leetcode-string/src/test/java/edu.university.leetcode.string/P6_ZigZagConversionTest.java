package edu.university.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class P6_ZigZagConversionTest {

    @Test
    public void convert1() throws Exception {
        String result = P6_ZigZagConversion.convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    public void convert2() throws Exception {
        String result = P6_ZigZagConversion.convert("PAYPALISHIRING", 5);
        assertEquals("PHASIYIRPLIGAN", result);
    }

    @Test
    public void convert3() throws Exception {
        String result = P6_ZigZagConversion.convert("PAYPALISHIRING", 7);
        assertEquals("PNAIGYRPIAHLSI", result);
    }

    @Test
    public void convert4() throws Exception {
        String result = P6_ZigZagConversion.convert("PAYPALISHIRING", 2);
        assertEquals("PYAIHRNAPLSIIG", result);
    }

    @Test
    public void convert5() throws Exception {
        String result = P6_ZigZagConversion.convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI", result);
    }

    @Test
    public void convert6() throws Exception {
        String result = P6_ZigZagConversion.convert("ABC", 2);
        assertEquals("ACB", result);
    }

    @Test
    public void convert7() throws Exception {
        String result = P6_ZigZagConversion.convert("ABCDEF", 2);
        assertEquals("ACEBDF", result);
    }

    @Test
    public void convert8() throws Exception {
        String result = P6_ZigZagConversion.convert("ABCDEF", 2);
        assertEquals("ACEBDF", result);
    }

    @Test
    public void convert9() throws Exception {
        String result = P6_ZigZagConversion.convert("ABCD", 2);
        assertEquals("ACBD", result);
    }


}