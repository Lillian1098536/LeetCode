package edu.university.leetcode.stack.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P456_132PatternTest {
    P456_132Pattern test = new P456_132Pattern();
    @Test
    public void find132pattern() {
        assertTrue(test.find132pattern(new int[]{3, 1, 4, 2}));
    }
}