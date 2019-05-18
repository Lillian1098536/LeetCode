package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P942_DIStringMatchTest {

    @Test
    public void diStringMatch() {
        assertArrayEquals(new int[]{0,4,1,3,2}, P942_DIStringMatch.diStringMatch("IDID"));
    }

}