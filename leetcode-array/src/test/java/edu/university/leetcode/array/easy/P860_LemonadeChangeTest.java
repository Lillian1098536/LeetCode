package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P860_LemonadeChangeTest {
    P860_LemonadeChange test = new P860_LemonadeChange();
    @Test
    public void lemonadeChange() {
        assertTrue(test.lemonadeChange(new int[]{5, 5, 5, 10, 20}));
        assertFalse(test.lemonadeChange(new int[]{5, 5, 10, 10, 20}));
        assertTrue(test.lemonadeChange(new int[]{5, 5, 10}));
        assertFalse(test.lemonadeChange(new int[]{10, 10}));
    }
}