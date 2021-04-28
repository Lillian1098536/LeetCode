package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P33_SearchInRotatedSortedArrayTest {
    P33_SearchInRotatedSortedArray test = new P33_SearchInRotatedSortedArray();
    @Test
    public void search() {
        assertEquals(2, test.search(new int[]{6, 7, 0, 1, 2, 4, 5}, 0));
    }
}