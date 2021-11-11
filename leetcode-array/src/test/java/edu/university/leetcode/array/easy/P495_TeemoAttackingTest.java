package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P495_TeemoAttackingTest {
    P495_TeemoAttacking test = new P495_TeemoAttacking();
    @Test
    public void findPoisonedDuration() {
        assertEquals(4, test.findPoisonedDuration(new int[] {1, 4}, 2));
        assertEquals(3, test.findPoisonedDuration(new int[] {1, 2}, 2));
    }
}