package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P35_SearchInsertPositionTest {

    @Test
    public void searchInsert1() throws Exception {
        int[] nums = {1, 3, 5, 6};
        int result = P35_SearchInsertPosition.searchInsert(nums, 5);
        assertEquals(2, result);
    }

    @Test
    public void searchInsert2() throws Exception {
        int[] nums = {1, 3, 5, 6};
        int result = P35_SearchInsertPosition.searchInsert(nums, 2);
        assertEquals(1, result);
    }

    @Test
    public void searchInsert3() throws Exception {
        int[] nums = {1, 3, 5, 6};
        int result = P35_SearchInsertPosition.searchInsert(nums, 7);
        assertEquals(4, result);
    }

    @Test
    public void searchInsert4() throws Exception {
        int[] nums = {1, 3, 5, 6};
        int result = P35_SearchInsertPosition.searchInsert(nums, 0);
        assertEquals(0, result);
    }

    @Test
    public void searchInsert5() throws Exception {
        int[] nums = {1, 3};
        int result = P35_SearchInsertPosition.searchInsert(nums, 3);
        assertEquals(1, result);
    }

}