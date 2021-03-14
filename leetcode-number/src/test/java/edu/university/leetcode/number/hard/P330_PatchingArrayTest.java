package edu.university.leetcode.number.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class P330_PatchingArrayTest {
    P330_PatchingArray test = new P330_PatchingArray();
    @Test
    public void minPatches() {
        assertEquals(1, test.minPatches(new int[]{1, 3}, 6));
//        assertEquals(1, test.minPatches(new int[]{1,2,31,33}, 2147483647));
    }
}