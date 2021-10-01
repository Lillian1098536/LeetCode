package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P136_SingleNumberTest {
    P136_SingleNumber test = new P136_SingleNumber();
    @Test
    public void singleNumber() throws Exception {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        int result = test.singleNumber(nums);
        assertEquals(4, result);
    }

}