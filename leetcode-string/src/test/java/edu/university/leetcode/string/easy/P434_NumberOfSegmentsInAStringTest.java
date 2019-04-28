package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P434_NumberOfSegmentsInAStringTest {

    @Test
    public void countSegments() {
        assertEquals(6, P434_NumberOfSegmentsInAString.countSegments(" , , , ,        a, eaefa "));
    }

    @Test
    public void countSegments2() {
        assertEquals(0, P434_NumberOfSegmentsInAString.countSegs("         "));
    }

}