package edu.university.leetcode.dynamicprogramming.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class P123_BestTimeToBuyAndSellStockIIITest {
    P123_BestTimeToBuyAndSellStockIII test = new P123_BestTimeToBuyAndSellStockIII();
    @Test
    public void maxProfit() {
        assertEquals(6, test.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
        assertEquals(4, test.maxProfit(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, test.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}