package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P243_ShortestWordDistanceTest {

    @Test
    public void shortestDistance() {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        assertEquals(3, P243_ShortestWordDistance.shortestDistance(words, "coding", "practice"));
    }
}