package edu.university.leetcode.array.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class P41_FirstMissingPositiveTest {

    P41_FirstMissingPositive test = new P41_FirstMissingPositive();

    @Test
    public void firstMissingPositive1() {
        assertEquals(3, test.firstMissingPositive(new int[]{1, 2, 0}));
    }

    @Test
    public void firstMissingPositive2() {
        assertEquals(2, test.firstMissingPositive(new int[]{3, 4, -1, 1}));
    }

    @Test
    public void firstMissingPositive3() {
        assertEquals(1, test.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }

    @Test
    public void firstMissingPositive4() {
        assertEquals(3, test.firstMissingPositive(new int[]{1, 2}));
    }

}