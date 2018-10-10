package edu.university.leetcode.string.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P43_MultiplyStringsTest {
    @Test
    public void multiply() throws Exception {
        String result = P43_MultiplyStrings.multiply("123", "456");
        assertEquals("56088", result);
    }

}