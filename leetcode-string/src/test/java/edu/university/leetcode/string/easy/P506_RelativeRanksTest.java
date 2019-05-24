package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P506_RelativeRanksTest {

    @Test
    public void findRelativeRanks() {
        String[] expected = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        String[] result = P506_RelativeRanks.findRelativeRanks(new int[]{5, 4, 3, 2, 1});
        assertArrayEquals(expected, result);
    }

}