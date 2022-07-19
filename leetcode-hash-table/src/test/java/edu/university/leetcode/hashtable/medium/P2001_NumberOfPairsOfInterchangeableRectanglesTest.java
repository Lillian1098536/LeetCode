package edu.university.leetcode.hashtable.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P2001_NumberOfPairsOfInterchangeableRectanglesTest {
    P2001_NumberOfPairsOfInterchangeableRectangles test = new P2001_NumberOfPairsOfInterchangeableRectangles();

    @Test
    public void interchangeableRectangles() {
        int[][] input1 = new int[][]{new int[]{4, 8}, new int[]{3, 6}, new int[]{10, 20}, new int[]{15, 30}};
        assertEquals(6, test.interchangeableRectangles(input1));
        int[][] input2 = new int[][]{new int[]{4, 5}, new int[]{7, 8}};
        assertEquals(0, test.interchangeableRectangles(input2));
        //[[32768,65536], ... 19999+]
        //4999950000
    }
}