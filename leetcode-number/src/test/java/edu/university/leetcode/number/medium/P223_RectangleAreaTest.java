package edu.university.leetcode.number.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P223_RectangleAreaTest {

    @Test
    public void computeAreaOverLap() {
        assertEquals(45, P223_RectangleArea.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    }

    @Test
    public void computeArea() {
        assertEquals(30, P223_RectangleArea.computeArea(-3, 2, 3, 4, 0, -1, 9, 1));
    }
}