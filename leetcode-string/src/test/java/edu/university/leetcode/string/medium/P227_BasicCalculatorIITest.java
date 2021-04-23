package edu.university.leetcode.string.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P227_BasicCalculatorIITest {
    P227_BasicCalculatorII test = new P227_BasicCalculatorII();
    @Test
    public void calculate() {
        assertEquals(7, test.calculate("3+2*2"));
        assertEquals(1, test.calculate("3/2"));
        assertEquals(5, test.calculate("3+5/2"));
    }
}