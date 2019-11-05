package edu.university.leetcode.matrix.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. Spiral Matrix
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * Example 1: Input:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * Example 2: Input:
 * [
 *   [1, 2, 3, 4],
 *   [5, 6, 7, 8],
 *   [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class P54_SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;
        int m = matrix.length, n = matrix[0].length, x = 0, y = 0;
        while (m > 0 && n > 0) {
            if (m == 1) {
                for (int i = 0; i < n; i++) {
                    result.add(matrix[x][y++]);
                }
                break;
            } else if (n == 1) {
                for (int i = 0; i < m; i++) {
                    result.add(matrix[x++][y]);
                }
                break;
            }

            for (int i = 0; i < n - 1; i++) {
                result.add(matrix[x][y++]);
            }
            for (int i = 0; i < m - 1;i++) {
                result.add(matrix[x++][y]);
            }
            for (int i = 0; i < n - 1;i++) {
                result.add(matrix[x][y--]);
            }
            for (int i = 0; i < m - 1;i++) {
                result.add(matrix[x--][y]);
            }
            x++;
            y++;
            m = m - 2;
            n = n - 2;
        }
        return result;
    }

}
