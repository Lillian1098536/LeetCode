package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1196_HowManyApplesCanYouPutIntoTheBasketTest {
    P1196_HowManyApplesCanYouPutIntoTheBasket test = new P1196_HowManyApplesCanYouPutIntoTheBasket();

    @Test
    public void maxNumberOfApples() {
        assertEquals(4, test.maxNumberOfApples(new int[]{100, 200, 150, 1000}));
        assertEquals(5, test.maxNumberOfApples(new int[]{900, 950, 800, 1000, 700, 800}));
    }
}