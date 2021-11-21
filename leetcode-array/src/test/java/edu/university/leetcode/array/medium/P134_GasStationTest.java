package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P134_GasStationTest {
    P134_GasStation test = new P134_GasStation();
    @Test
    public void canCompleteCircuit() {
        assertEquals(3, test.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        assertEquals(-1, test.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }
}