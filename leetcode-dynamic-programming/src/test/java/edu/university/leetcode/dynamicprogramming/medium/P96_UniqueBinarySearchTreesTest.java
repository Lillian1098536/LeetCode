package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P96_UniqueBinarySearchTreesTest {
    P96_UniqueBinarySearchTrees test = new P96_UniqueBinarySearchTrees();
    @Test
    public void numTrees() {
        assertEquals(5, test.numTrees(3));
    }
}