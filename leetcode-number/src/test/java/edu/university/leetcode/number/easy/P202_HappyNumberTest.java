package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P202_HappyNumberTest {
    @Test
    public void isHappy() throws Exception {
        boolean result = P202_HappyNumber.isHappy(16);
        assertEquals(false, result);
    }

}