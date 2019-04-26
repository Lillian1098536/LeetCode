package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P408_ValidWordAbbreviationTest {

    @Test
    public void validWordAbbreviationTrue() {
        assertTrue(P408_ValidWordAbbreviation.validWordAbbreviation("internationalization", "i12iz4n"));
    }

    @Test
    public void validWordAbbreviationFalse() {
        assertTrue(!P408_ValidWordAbbreviation.validWordAbbreviation("apple", "a2e"));
    }

}