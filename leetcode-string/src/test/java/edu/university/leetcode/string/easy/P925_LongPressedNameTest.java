package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P925_LongPressedNameTest {

    @Test
    public void isLongPressedNameT() {
        assertTrue(P925_LongPressedName.isLongPressedName("alex", "aaleex"));
    }

    @Test
    public void isLongPressedNameF() {
        assertTrue(!P925_LongPressedName.isLongPressedName("saeed", "ssaaedd"));
    }
}