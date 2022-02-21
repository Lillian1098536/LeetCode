package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P2180_CountIntegersWithEvenDigitSumTest {
    P2180_CountIntegersWithEvenDigitSum test = new P2180_CountIntegersWithEvenDigitSum();
    @Test
    public void countEven() {
        assertEquals(2, test.countEven(4));
        assertEquals(14, test.countEven(29));
        assertEquals(14, test.countEven(30));
        assertEquals(15, test.countEven(31));
        assertEquals(403, test.countEven(807));
        assertEquals(404, test.countEven(808));
        assertEquals(404, test.countEven(809));
    }
}