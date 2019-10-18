package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P581_ShortestUnsortedContinuousSubarrayTest {

    P581_ShortestUnsortedContinuousSubarray test = new P581_ShortestUnsortedContinuousSubarray();
    @Test
    public void findUnsortedSubarray1() {
        assertEquals(5, test.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }
    @Test
    public void findUnsortedSubarray2() {
        assertEquals(4, test.findUnsortedSubarray(new int[]{1,3,2,2,2}));
    }
    @Test
    public void findUnsortedSubarray3() {
        assertEquals(0, test.findUnsortedSubarray(new int[]{1,2,3,3,3}));
    }
}