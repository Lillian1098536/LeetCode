package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P55_JumpGameTest {
    @Test
    public void canJump1() throws Exception {
        int[] input = {2, 3, 1, 1, 4};
        assertTrue(P55_JumpGame.canJump(input));
    }

    @Test
    public void canJump2() throws Exception {
        int[] input = {3,2,1,0,4};
        assertTrue(!P55_JumpGame.canJump(input));
    }

}