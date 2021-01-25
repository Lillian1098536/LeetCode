package edu.university.leetcode.string.easy;

import org.junit.Test;

import static edu.university.leetcode.string.easy.P172_FactorialTrailingZeroes.trailingZeroes;
import static org.junit.Assert.*;

public class P172_FactorialTrailingZeroesTest {

    @Test
    public void testTrailingZeroes() {
        assertEquals(0, trailingZeroes(0));
        assertEquals(0, trailingZeroes(3));
        assertEquals(0, trailingZeroes(4));
        assertEquals(1, trailingZeroes(5));
        assertEquals(2, trailingZeroes(10));
        assertEquals(3, trailingZeroes(15));
        assertEquals(4, trailingZeroes(20));
        assertEquals(24, trailingZeroes(104));
    }
}