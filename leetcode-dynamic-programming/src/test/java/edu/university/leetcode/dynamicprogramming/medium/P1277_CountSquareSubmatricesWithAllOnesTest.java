package edu.university.leetcode.dynamicprogramming.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1277_CountSquareSubmatricesWithAllOnesTest {
    P1277_CountSquareSubmatricesWithAllOnes test = new P1277_CountSquareSubmatricesWithAllOnes();
    @Test
    public void countSquares() {
        int[][] matrix = new int[][] {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        assertEquals(15, test.countSquares(matrix));
    }

}