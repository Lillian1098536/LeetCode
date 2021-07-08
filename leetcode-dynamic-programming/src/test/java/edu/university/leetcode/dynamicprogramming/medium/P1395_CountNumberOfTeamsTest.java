package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1395_CountNumberOfTeamsTest {
    P1395_CountNumberOfTeams test = new P1395_CountNumberOfTeams();
    @Test
    public void numTeams() {
        assertEquals(3, test.numTeams(new int[]{2, 5, 3, 4, 1}));
        assertEquals(4, test.numTeams(new int[]{1, 2, 3, 4}));
    }
}