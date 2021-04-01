package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P213_HouseRobberIITest {

    P213_HouseRobberII test = new P213_HouseRobberII();

    @Test
    public void rob() {
        assertEquals(3, test.rob(new int[]{2, 3, 2}));
        assertEquals(4, test.rob(new int[]{1, 2, 3, 1}));
        assertEquals(0, test.rob(new int[]{0}));
    }
}