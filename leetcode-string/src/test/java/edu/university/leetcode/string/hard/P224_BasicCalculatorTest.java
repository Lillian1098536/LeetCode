package edu.university.leetcode.string.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class P224_BasicCalculatorTest {
    P224_BasicCalculator test = new P224_BasicCalculator();
    @Test
    public void calculate() {
        assertEquals(23, test.calculate("(1+(4+5+2)-3)+(6+8)"));
        assertEquals(2147483647, test.calculate("2147483647"));
    }
}