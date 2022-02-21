package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P714_BestTimeToBuyAndSellStockWithTransactionFeeTest {
    P714_BestTimeToBuyAndSellStockWithTransactionFee test = new P714_BestTimeToBuyAndSellStockWithTransactionFee();
    @Test
    public void maxProfit() {
        assertEquals(8, test.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
        assertEquals(6, test.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3));
    }
}