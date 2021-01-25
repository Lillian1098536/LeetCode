package edu.university.leetcode.string.easy;

import org.junit.Test;

import static edu.university.leetcode.string.easy.P172_FactorialTrailingZeroes.trailingZeroes;
import static org.junit.Assert.*;

public class P172_FactorialTrailingZeroesTest {

    @Test
    public void testTrailingZeroes() {
        assertEquals(0, trailingZeroes(3));
        assertEquals(1, trailingZeroes(5));
        assertEquals(0, trailingZeroes(0));
    }
}