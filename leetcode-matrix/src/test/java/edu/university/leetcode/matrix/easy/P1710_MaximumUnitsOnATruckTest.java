package edu.university.leetcode.matrix.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1710_MaximumUnitsOnATruckTest {
    P1710_MaximumUnitsOnATruck test = new P1710_MaximumUnitsOnATruck();
    @Test
    public void maximumUnits() {
        assertEquals(8, test.maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4));
        assertEquals(91, test.maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10));
        assertEquals(48, test.maximumUnits(new int[][]{{2, 1}, {4, 4}, {3, 1}, {4, 1}, {2, 4}, {3, 4}, {1, 3}, {4, 3}, {5, 3}, {5, 3}}, 13));
        assertEquals(95, test.maximumUnits(new int[][]{{4, 2}, {5, 5}, {4, 1}, {1, 4}, {2, 5}, {1, 3}, {5, 3}, {1, 5}, {5, 5}, {1, 1}}, 24));
    }
}