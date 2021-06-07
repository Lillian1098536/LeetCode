package edu.university.leetcode.dynamicprogramming.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class P72_EditDistanceTest {
    P72_EditDistance test = new P72_EditDistance();
    @Test
    public void minDistance() {
        assertEquals(3, test.minDistance("horse", "ros"));
    }
}