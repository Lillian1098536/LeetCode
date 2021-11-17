package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1736_LatestTimeByReplacingHiddenDigitsTest {
    P1736_LatestTimeByReplacingHiddenDigits test = new P1736_LatestTimeByReplacingHiddenDigits();
    @Test
    public void maximumTime() {
        assertTrue("23:50".equals(test.maximumTime("2?:?0")));
        assertTrue("09:39".equals(test.maximumTime("0?:3?")));
        assertTrue("19:22".equals(test.maximumTime("1?:22")));
    }
}