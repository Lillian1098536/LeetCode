package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1221_SplitAStringInBalancedStringsTest {
    P1221_SplitAStringInBalancedStrings test = new P1221_SplitAStringInBalancedStrings();
    @Test
    public void balancedStringSplit() {
        assertEquals(4, test.balancedStringSplit("RLRRLLRLRL"));
        assertEquals(3, test.balancedStringSplit("RLLLLRRRLR"));
        assertEquals(1, test.balancedStringSplit("LLLLRRRR"));
        assertEquals(2, test.balancedStringSplit("RLRRRLLRLL"));
    }
}