package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P415_AddStringsTest {

    @Test
    public void addStrings() {
        assertEquals("111", P415_AddStrings.addStrings("79", "32"));
    }

    @Test
    public void addStrings2() {
        assertEquals("507", P415_AddStrings.addStrings("6", "501"));
    }

}