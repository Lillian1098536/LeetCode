package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P45_MinimumMovesToEqualArrayElementsTest {
    P45_MinimumMovesToEqualArrayElements test = new P45_MinimumMovesToEqualArrayElements();
    @Test
    public void minMoves() {
        assertEquals(3, test.minMoves(new int[]{1, 2, 3}));
    }
}