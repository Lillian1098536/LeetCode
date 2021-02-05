package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P169_MajorityElementTest {
    P169_MajorityElement test = new P169_MajorityElement();
    @Test
    public void majorityElement() {
        assertEquals(3, test.majorityElement(new int[]{3, 2, 3}));
        assertEquals(2, test.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        assertEquals(5, test.majorityElement(new int[]{6, 5, 5}));
    }
}