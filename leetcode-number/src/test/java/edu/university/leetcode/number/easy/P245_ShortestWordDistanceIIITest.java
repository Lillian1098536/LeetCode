package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P245_ShortestWordDistanceIIITest {

    @Test
    public void shortestDistance() {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        assertEquals(3, P245_ShortestWordDistanceIII.shortestDistance(words, "makes", "makes"));
    }
}