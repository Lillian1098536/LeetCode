package edu.university.leetcode.hashtable.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1512_NumberOfGoodPairsTest {
    P1512_NumberOfGoodPairs test = new P1512_NumberOfGoodPairs();
    @Test
    public void numIdenticalPairs() {
        assertEquals(4, test.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }
}