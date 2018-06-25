package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P268_MissingNumberTest {
    @Test
    public void missingNumber1() throws Exception {
        int[] nums = {3, 0, 1};
        assertEquals(2, P268_MissingNumber.missingNumber(nums));
    }

    @Test
    public void missingNumber2() throws Exception {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(8, P268_MissingNumber.missingNumber(nums));
    }

}