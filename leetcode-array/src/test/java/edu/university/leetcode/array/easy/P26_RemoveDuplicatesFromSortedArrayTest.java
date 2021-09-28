package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P26_RemoveDuplicatesFromSortedArrayTest {
    P26_RemoveDuplicatesFromSortedArray test = new P26_RemoveDuplicatesFromSortedArray();
    @Test
    public void removeDuplicates1() throws Exception {
        int[] nums = {1, 1, 2, 3, 3, 3, 4, 4};
        int result = test.removeDuplicates(nums);
        assertEquals(4, result);
    }

    @Test
    public void removeDuplicates2() throws Exception {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 2, 2, 4};
        int result = test.removeDuplicates(nums);
        assertEquals(4, result);
    }

}