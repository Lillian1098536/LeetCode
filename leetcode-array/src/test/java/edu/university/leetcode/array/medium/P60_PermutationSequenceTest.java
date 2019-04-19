package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P60_PermutationSequenceTest {

    @Test
    public void getPermutation1() {
        assertEquals("123468795", P60_PermutationSequence.getPermutation(9, 40));
    }

    @Test
    public void getPermutation2() {
        assertEquals("2314", P60_PermutationSequence.getPermutation(4, 9));
    }
}