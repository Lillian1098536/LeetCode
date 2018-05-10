package edu.university.leetcode.number.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P11_ContainerWithMostWaterTest {
    @Test
    public void maxArea() throws Exception {
        int[] test = new int[] {1, 2, 5, 6, 1};
        int result = P11_ContainerWithMostWater.maxArea(test);
        assertEquals(5, result);
    }

}