package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P787_CheapestFlightsWithinKStopsTest {

    @Test
    public void findCheapestPrice() {
        int n = 3, src = 0, dst = 2, K = 1;
        int[][] flights = {{0,1,100},{1,2,100},{0,2,500}};
        int result = P787_CheapestFlightsWithinKStops.findCheapestPrice(n, flights, src, dst, K);
        assertEquals(200, result);
    }
}