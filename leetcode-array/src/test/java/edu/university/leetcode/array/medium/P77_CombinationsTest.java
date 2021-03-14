package edu.university.leetcode.array.medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class P77_CombinationsTest {
    P77_Combinations test = new P77_Combinations();
    @Test
    public void combine() {
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(1, 3),
                Arrays.asList(1, 4),
                Arrays.asList(2, 3),
                Arrays.asList(2, 4),
                Arrays.asList(3, 4)
        );
        assertEquals(expected, test.combine(4, 2));
        assertEquals(expected, test.combination(4, 2));
    }
}