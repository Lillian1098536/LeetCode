package edu.university.leetcode.hashtable.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2475_NumberOfUnequalTripletsInArrayTest {
    P2475_NumberOfUnequalTripletsInArray test = new P2475_NumberOfUnequalTripletsInArray();

    @Test
    void unequalTriplets() {
        assertEquals(3, test.unequalTriplets(new int[]{4, 4, 2, 4, 3}));
        assertEquals(0, test.unequalTriplets(new int[]{1, 1, 1, 1, 1}));
    }
}