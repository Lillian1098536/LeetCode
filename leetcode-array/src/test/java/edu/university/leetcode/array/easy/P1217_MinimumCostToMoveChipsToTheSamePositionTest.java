package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1217_MinimumCostToMoveChipsToTheSamePositionTest {
    P1217_MinimumCostToMoveChipsToTheSamePosition test = new P1217_MinimumCostToMoveChipsToTheSamePosition();
    @Test
    public void minCostToMoveChips() {
        assertEquals(1, test.minCostToMoveChips(new int[]{1, 2, 3}));
        assertEquals(2, test.minCostToMoveChips(new int[]{2, 2, 2, 3, 3}));
        assertEquals(1, test.minCostToMoveChips(new int[]{1, 1000000000}));
    }
}