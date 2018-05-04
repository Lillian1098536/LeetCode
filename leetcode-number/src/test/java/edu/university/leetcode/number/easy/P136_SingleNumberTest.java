package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P136_SingleNumberTest {
    @Test
    public void singleNumber() throws Exception {
        int[] test = new int[]{4, 1, 2, 1, 2};
        int result = P136_SingleNumber.singleNumber(test);
        assertEquals(4, result);
    }

}