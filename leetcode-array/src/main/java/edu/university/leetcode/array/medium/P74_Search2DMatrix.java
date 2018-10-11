package edu.university.leetcode.array.medium;

/**
 * 74. Search a 2D Matrix
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * Example 1: Input: matrix = [
 *                             [1,   3,  5,  7],
 *                             [10, 11, 16, 20],
 *                             [23, 30, 34, 50]
 *                            ]
 * target = 3 Output: true
 * Example 2: Input: matrix = [
 *                             [1,   3,  5,  7],
 *                             [10, 11, 16, 20],
 *                             [23, 30, 34, 50],
 *                            ]
 * target = 13 Output: false
 */
public class P74_Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][matrix[i].length - 1]) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
