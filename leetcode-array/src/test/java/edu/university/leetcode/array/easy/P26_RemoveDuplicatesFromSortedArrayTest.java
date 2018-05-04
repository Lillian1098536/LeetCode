package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P26_RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicates1() throws Exception {
        int[] nums = {1, 1, 2, 3, 3, 3, 4, 4};
        int result = P26_RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(4, result);
    }

    @Test
    public void removeDuplicates2() throws Exception {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 2, 2, 4};
        int result = P26_RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(4, result);
    }

}