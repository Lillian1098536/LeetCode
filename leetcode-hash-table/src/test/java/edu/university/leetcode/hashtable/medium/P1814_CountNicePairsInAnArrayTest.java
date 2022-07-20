package edu.university.leetcode.hashtable.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1814_CountNicePairsInAnArrayTest {
    P1814_CountNicePairsInAnArray test = new P1814_CountNicePairsInAnArray();

    @Test
    public void countNicePairs() {
        assertEquals(2, test.countNicePairs(new int[]{42, 11, 1, 97}));
        assertEquals(4, test.countNicePairs(new int[]{13, 10, 35, 24, 76}));
    }
}