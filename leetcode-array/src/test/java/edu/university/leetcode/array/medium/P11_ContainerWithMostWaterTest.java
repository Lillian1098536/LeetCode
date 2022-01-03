package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P11_ContainerWithMostWaterTest {
    P11_ContainerWithMostWater test = new P11_ContainerWithMostWater();
    @Test
    public void maxArea() {
        assertEquals(49, test.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}