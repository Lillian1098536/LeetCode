package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P219_ContainsDuplicateIITest {
    P219_ContainsDuplicateII test = new P219_ContainsDuplicateII();

    @Test
    public void containsNearbyDuplicate() throws Exception {
        assertTrue(test.containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        assertTrue(test.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        assertFalse(test.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

}