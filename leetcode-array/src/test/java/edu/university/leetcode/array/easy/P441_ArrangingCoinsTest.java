package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P441_ArrangingCoinsTest {

    @Test
    public void arrangeCoins1() {
        assertEquals(3, P441_ArrangingCoins.arrangeCoins(8));
    }

    @Test
    public void arrangeCoins2() {
        assertEquals(65535, P441_ArrangingCoins.arrangeCoins(2147483647));
    }

    @Test
    public void arrangeCoins3() {
        assertEquals(65535, P441_ArrangingCoins.arrange(2147483647));
    }

}