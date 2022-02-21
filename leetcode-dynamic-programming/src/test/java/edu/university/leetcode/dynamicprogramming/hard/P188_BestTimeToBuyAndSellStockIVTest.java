package edu.university.leetcode.dynamicprogramming.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class P188_BestTimeToBuyAndSellStockIVTest {
    P188_BestTimeToBuyAndSellStockIV test = new P188_BestTimeToBuyAndSellStockIV();
    @Test
    public void maxProfit() {
        assertEquals(2, test.maxProfit(2, new int[]{2, 4, 1}));
        assertEquals(7, test.maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
    }
}