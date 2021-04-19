package edu.university.leetcode.dynamicprogramming.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzConjectureTest {
    CollatzConjecture test = new CollatzConjecture();
    @Test
    public void collatz() {
        assertEquals(1, test.collatz(7));
        assertEquals(1, test.collatz(12));
    }
}