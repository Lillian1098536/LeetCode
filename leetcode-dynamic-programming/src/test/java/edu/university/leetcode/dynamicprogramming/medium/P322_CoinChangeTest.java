package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P322_CoinChangeTest {
    @Test
    public void coinChange1() throws Exception {
        int[] coins = {1, 2, 5};
        int amount = 11;
        assertEquals(3, P322_CoinChange.coinChange(coins, amount));
    }

    @Test
    public void coinChange2() throws Exception {
        int[] coins = {2};
        int amount = 3;
        assertEquals(-1, P322_CoinChange.coinChange(coins, amount));
    }

}