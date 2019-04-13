package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P400_NthDigitTest {

    @Test
    public void findNthDigit11() {
        assertEquals(0, P400_NthDigit.findNthDigit(11));
    }

    @Test
    public void findNthDigit111() {
        assertEquals(1, P400_NthDigit.findNthDigit(12));
    }
}