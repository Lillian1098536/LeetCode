package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P179_LargestNumberTest {
    P179_LargestNumber test = new P179_LargestNumber();
    @Test
    public void largestNumber() {
        assertTrue("210".equals(test.largestNumber(new int[]{10, 2})));
        assertTrue("9534330".equals(test.largestNumber(new int[]{3, 30, 34, 5, 9})));
        assertTrue("1".equals(test.largestNumber(new int[]{1})));
        assertTrue("10".equals(test.largestNumber(new int[]{10})));
    }
}