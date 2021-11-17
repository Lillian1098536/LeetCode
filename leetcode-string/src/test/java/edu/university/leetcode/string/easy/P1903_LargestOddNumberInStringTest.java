package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1903_LargestOddNumberInStringTest {
    P1903_LargestOddNumberInString test = new P1903_LargestOddNumberInString();
    @Test
    public void largestOddNumber() {
        assertTrue("5".equals(test.largestOddNumber("52")));
        assertTrue("".equals(test.largestOddNumber("4206")));
        assertTrue("35427".equals(test.largestOddNumber("35427")));
        assertTrue("1013389".equals(test.largestOddNumber("10133890")));
    }
}