package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P45_MinimumMovesToEqualArrayElementsTest {

    @Test
    public void minMoves() {
        assertEquals(3, P45_MinimumMovesToEqualArrayElements.minMoves(new int[]{1, 2, 3}));
    }
}