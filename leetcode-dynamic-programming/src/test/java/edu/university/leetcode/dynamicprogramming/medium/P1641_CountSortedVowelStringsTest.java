package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1641_CountSortedVowelStringsTest {

    private P1641_CountSortedVowelStrings test = new P1641_CountSortedVowelStrings();
    @Test
    public void countVowelStrings() {
        assertEquals(15, test.countVowelStrings(2));
    }
}