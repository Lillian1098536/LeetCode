package edu.university.leetcode.string.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class P67_AddBinaryTest {

    @Test
    public void addBinary() throws Exception {
        String a = "11", b ="1";
        String result = P67_AddBinary.addBinary(a, b);
        assertEquals("100", result);
    }

}