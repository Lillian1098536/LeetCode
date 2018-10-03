package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P31_NextPermutationTest {
    @Test
    public void nextPermutation() throws Exception {
        int[] test = {2, 3, 6, 5, 4, 1};
        P31_NextPermutation.nextPermutation(test);
        int[] expected = {2, 4, 1, 3, 5, 6};
        assertArrayEquals(test, expected);
    }

}