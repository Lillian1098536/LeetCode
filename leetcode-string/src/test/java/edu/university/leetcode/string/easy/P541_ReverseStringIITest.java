package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P541_ReverseStringIITest {

    @Test
    public void reverseStr() {
        assertEquals("bacdfeg", P541_ReverseStringII.reverseStr("abcdefg", 2));
    }

}