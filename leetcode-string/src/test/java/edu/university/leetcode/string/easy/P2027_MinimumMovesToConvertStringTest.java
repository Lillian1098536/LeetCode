package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P2027_MinimumMovesToConvertStringTest {
    P2027_MinimumMovesToConvertString test = new P2027_MinimumMovesToConvertString();
    @Test
    public void minimumMoves() {
        assertEquals(1, test.minimumMoves("XXX"));
        assertEquals(2, test.minimumMoves("XXOX"));
        assertEquals(0, test.minimumMoves("OOOO"));
    }
}