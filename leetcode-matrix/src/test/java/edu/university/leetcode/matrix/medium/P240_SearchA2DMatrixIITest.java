package edu.university.leetcode.matrix.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P240_SearchA2DMatrixIITest {

    @Test
    public void searchMatrixT() {
        int[][] matrix = new int[][]{{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}};
        assertTrue(P240_SearchA2DMatrixII.searchMatrix(matrix, 5));
    }

    @Test
    public void searchMatrixF() {
        int[][] matrix = new int[][]{{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};
        assertTrue(!P240_SearchA2DMatrixII.searchMatrix(matrix, 20));
    }
}