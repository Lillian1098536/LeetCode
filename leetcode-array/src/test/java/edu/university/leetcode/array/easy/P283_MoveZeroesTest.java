package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P283_MoveZeroesTest {
    @Test
    public void moveZeroes() throws Exception {
        int[] test = new int[]{0, 1, 0, 3, 12};
        int[] expected = new int[] {1,3,12,0,0};
        P283_MoveZeroes.moveZeroes(test);
        for (int i = 0; i < test.length; i++) {
            assertEquals(expected[i], test[i]);
        }
    }

}