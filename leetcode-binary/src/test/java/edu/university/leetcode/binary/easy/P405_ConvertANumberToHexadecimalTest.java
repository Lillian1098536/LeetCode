package edu.university.leetcode.binary.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P405_ConvertANumberToHexadecimalTest {

    @Test
    public void toHex1() {
        assertEquals("1a", P405_ConvertANumberToHexadecimal.toHex(26));
    }

    @Test
    public void toHex2() {
        assertEquals("ffffffff", P405_ConvertANumberToHexadecimal.toHex(-1));
    }

    @Test
    public void toHex3() {
        assertEquals("21", P405_ConvertANumberToHexadecimal.toHex(33));
    }

}