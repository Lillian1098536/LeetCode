package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P309_BestTimeToBuyAndSellStockWithCoolDownTest {
    P309_BestTimeToBuyAndSellStockWithCoolDown test = new P309_BestTimeToBuyAndSellStockWithCoolDown();
    @Test
    public void maxProfit() {
        assertEquals(3, test.maxProfit(new int[]{1, 2, 3, 0, 2}));
        assertEquals(0, test.maxProfit(new int[]{1}));
    }
}