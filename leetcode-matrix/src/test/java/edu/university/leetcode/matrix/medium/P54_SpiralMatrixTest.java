package edu.university.leetcode.matrix.medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class P54_SpiralMatrixTest {

    @Test
    public void spiralOrder() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        List<Integer> test = P54_SpiralMatrix.spiralOrder(matrix);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(result.get(i), test.get(i));
        }
    }
}