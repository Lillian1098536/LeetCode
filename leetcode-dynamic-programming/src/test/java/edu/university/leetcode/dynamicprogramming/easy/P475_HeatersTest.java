package edu.university.leetcode.dynamicprogramming.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P475_HeatersTest {

    @Test
    public void findRadius() {
        int[] houses = new int[]{1, 2, 3, 4,}, heaters = new int[]{1, 4};
        assertEquals(1, P475_Heaters.findRadius(houses, heaters));
    }

}