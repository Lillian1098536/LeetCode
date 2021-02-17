package edu.university.leetcode.dynamicprogramming.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class P45_JumpGameIITest {
    P45_JumpGameII test = new P45_JumpGameII();
    @Test
    public void jump() {
        assertEquals(2, test.jump(new int[]{2, 3, 1, 1, 4}));
    }
}