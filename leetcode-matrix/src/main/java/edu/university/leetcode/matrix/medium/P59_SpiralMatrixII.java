package edu.university.leetcode.matrix.medium;

/**
 * 59. Spiral Matrix II
 * Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 * Example: Input: 3
 * Output:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 */
public class P59_SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int left = 0, right = n - 1, up = 0, down = n - 1, count = 1;
        while (left <= right && up <= down) {
            for (int i = left; i <= right; i++) {
                result[up][i] = count++;
            }
            up++;
            for (int i = up; i <= down; i++) {
                result[i][right] = count++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                result[down][i] = count++;
            }
            down--;
            for (int i = down; i >= up; i--) {
                result[i][left] = count++;
            }
        }
        return result;
    }

}
