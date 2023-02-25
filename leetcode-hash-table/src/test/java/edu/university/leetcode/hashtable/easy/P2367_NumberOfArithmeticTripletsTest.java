package edu.university.leetcode.hashtable.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2367_NumberOfArithmeticTripletsTest {
    P2367_NumberOfArithmeticTriplets test = new P2367_NumberOfArithmeticTriplets();
    @Test
    void arithmeticTriplets() {
        assertEquals(2, test.arithmeticTriplets(new int[]{0,1,4,6,7,10}, 3));
        assertEquals(2, test.arithmeticTriplets(new int[]{4, 5, 6, 7, 8, 9}, 2));
    }
}