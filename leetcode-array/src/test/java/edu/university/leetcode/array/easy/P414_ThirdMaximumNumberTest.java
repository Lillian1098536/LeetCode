package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P414_ThirdMaximumNumberTest {

    @Test
    public void thirdMax() {
        assertEquals(4, P414_ThirdMaximumNumber.thirdMax(new int[] {1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void thirdMaxNum() {
        assertEquals(4, P414_ThirdMaximumNumber.thirdMaxNum(new int[] {1, 2, 3, 4, 5, 6}));
    }
}