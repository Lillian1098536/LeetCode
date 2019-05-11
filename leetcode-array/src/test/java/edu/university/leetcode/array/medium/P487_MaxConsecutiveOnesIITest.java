package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P487_MaxConsecutiveOnesIITest {

    @Test
    public void findMaxConsecutiveOnes() {
        assertEquals(4, P487_MaxConsecutiveOnesII.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0}));
    }

}