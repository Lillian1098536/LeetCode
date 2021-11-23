package edu.university.leetcode.array.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class P135_CandyTest {
    P135_Candy test = new P135_Candy();
    @Test
    public void candy() {
        assertEquals(5, test.candy(new int[]{1, 0, 2}));
        assertEquals(4, test.candy(new int[]{1, 2, 2}));
        assertEquals(15, test.candy(new int[]{4, 3, 2, 1, 0}));
        assertEquals(10, test.candy(new int[]{1, 2, 2, 3, 2, 0}));
        assertEquals(31, test.candy(new int[]{1, 2, 2, 5, 6, 4, 6, 7, 2, 0, 8, 8, 8, 9, 8, 8, 7, 3}));
    }
}